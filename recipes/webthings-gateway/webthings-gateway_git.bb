SUMMARY = "Web of Things gateway"
HOMEPAGE = "https://webthings.io"

include ${PN}-license.inc

DEPENDS += " \
    nodejs-native \
    python3-native \
    gifsicle-native \
    sqlite3 \
    "

RDEPENDS_${PN} += " \
    bash \
    boost \
    curl \
    ffmpeg \
    git \
    glib-2.0 \
    iputils \
    libffi \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'libudev', '', d)} \
    libusb1 \
    mosquitto \
    nodejs \
    nodejs-npm \
    ${@bb.utils.contains('DISTRO_FEATURES', 'polkit', 'polkit', '', d)} \
    python3 \
    python3-gateway-addon \
    python3-pip \
    python3-six \
    sqlite3 \
    ${@bb.utils.contains('DISTRO_FEATURES', 'pam', 'util-linux', '', d)} \
    webthings-default-language-en \
    "

PV = "1.1.0+git${SRCPV}"
SRCREV = "4c600fc973effc9dad335f65c3dea243bd5da225"

SRC_URI = " \
    git://github.com/WebThingsIO/gateway.git;protocol=https;branch=master \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    file://default.js \
    file://local.json \
    file://run-app.sh \
    file://post-upgrade.sh \
    file://${BPN}.profile \
    file://${BPN}.service \
    file://${BPN}.check-for-update.service \
    file://${BPN}.check-for-update.timer \
    "

S = "${WORKDIR}/git"

inherit systemd

INSTALL_BASE = "/opt/gateway"
INSTALL_USER = "root"

do_compile() {

    # prevent host contamination, and use defaults for cache
    export HOME="${WORKDIR}"

    # required to properly cross compile for target
    export CFLAGS="${BUILD_CFLAGS} -v"
    export CXXFLAGS="${BUILD_CXXFLAGS} -v"
    export CPPFLAGS="${BUILD_CPPFLAGS} -v"
    export LDFLAGS="${BUILD_LDFLAGS} -Wl,--hash-style=gnu -v"
    export LD="${BUILD_LD}"
    export PYTHON=${STAGING_DIR_NATIVE}${bindir}/python3-native/python3

    cd ${S}

    echo '* evnironment ************************************'
    env

    echo '* npm install ************************************'
    # fsevent install prevents build break, even though fsevents is not used on linux
    npm \
        --user root \
        --arch=${TARGET_ARCH} \
        --build-from-source=true \
        --loglevel=verbose \
        --python=${STAGING_DIR_NATIVE}${bindir}/python3-native/python3 \
        --sqlite=${STAGING_DIR_TARGET}${libdir} \
        --target-arch=${TARGET_ARCH} \
        install fsevents@latest -f --save-optional

    echo '* fixup gifsicle with native bin  ****************'
    # gifsicle is just a build dependency
    mkdir -p ${S}/node_modules/gifsicle/vendor/
    cp ${STAGING_DIR_NATIVE}${bindir}/gifsicle ${S}/node_modules/gifsicle/vendor/

    echo '* audit ******************************************'
    npm audit ||true

    echo '* envinfo ****************************************'
    ./node_modules/.bin/envinfo ||true

    echo '* webpack info ***********************************'
    ./node_modules/.bin/webpack i ||true

    echo '* build ******************************************'
    npm run build

    echo '* prevent fsevents packaging *********************'
    npm uninstall fsevents
    
    echo '* remove devDependencies *************************'
    npm prune --production

    echo '* clean up ***************************************'
    find build -name '*.ts' -delete
    find build -name '*.map' -delete

    rm -rf node_modules/sqlite3/build*
    rm -rf node_modules/sqlite3/Dockerfile
    rm -rf node_modules/sqlite3/tools/docker/
    rm -rf node_modules/node-gyp/gyp/samples/

    echo '* fix up paths ***********************************'
    find node_modules -iname package.json -print0 | xargs -0 -n1 sed -i "s|${S}|${INSTALL_BASE}|g"

    # not sure why it uses arm64 vs aarch64
    mv node_modules/sqlite3/lib/binding/napi-v3-linux-aarch64 node_modules/sqlite3/lib/binding/napi-v3-linux-arm64 || true
}

do_install() {

    cd ${S}

    # QA package fix.  We don't have /usr/bin/python symlink
    sed -i 's|#!/usr/bin/python|#!/usr/bin/env python3|g' pagekite.py

    # fix up run script
    sed -i 's|\${HOME}/webthings/gateway|/opt/gateway|g' run-app.sh

    install -d          ${D}${INSTALL_BASE}
    cp -r build         ${D}${INSTALL_BASE}/
    cp -r node_modules  ${D}${INSTALL_BASE}/
    cp -r static        ${D}${INSTALL_BASE}/
    cp -r tools         ${D}${INSTALL_BASE}/

    install -Dm644 ${WORKDIR}/default.js     ${D}${INSTALL_BASE}/config/default.js
    install -m755 ${WORKDIR}/run-app.sh      ${D}${INSTALL_BASE}/

    install -m644 LICENSE                    ${D}${INSTALL_BASE}/
    install -m644 package.json               ${D}${INSTALL_BASE}/
    install -m644 package-lock.json          ${D}${INSTALL_BASE}/
    install -m755 pagekite.py                ${D}${INSTALL_BASE}/

    install -Dm644 ${WORKDIR}/local.json     ${D}/home/${INSTALL_USER}/.webthings/config/local.json
    install -d                               ${D}/home/${INSTALL_USER}/.webthings/log
    install -Dm644 ${WORKDIR}/${PN}.profile  ${D}/home/${INSTALL_USER}/.profile

    # override post-upgrade.sh
    install -m755 ${WORKDIR}/post-upgrade.sh        ${D}${INSTALL_BASE}/tools/

    find ${D}${INSTALL_BASE} -type d -exec chmod 0755 '{}' +

    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -Dm644 ${WORKDIR}/${PN}.service                  ${D}${systemd_system_unitdir}/${PN}.service
        install -Dm644 ${WORKDIR}/${PN}.check-for-update.timer   ${D}${systemd_system_unitdir}/${PN}.check-for-update.timer
        install -Dm644 ${WORKDIR}/${PN}.check-for-update.service ${D}${systemd_system_unitdir}/${PN}.check-for-update.service
    fi
}

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}', '', d)}"
SYSTEMD_SERVICE_${PN} += "\
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}.service', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}.check-for-update.timer', '', d)} \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}.check-for-update.service', '', d)} \
"

FILES_${PN} += "\
    /opt \
    /home \
    ${systemd_system_unitdir} \
    "
