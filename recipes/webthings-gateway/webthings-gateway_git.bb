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
    autoconf \
    bash \
    boost \
    dnsmasq \
    git \
    glib-2.0 \
    hostapd \
    libffi \
    libpng \
    libtool \
    ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'libudev', '', d)} \
    libusb1 \
    make \
    nodejs \
    ${@bb.utils.contains('DISTRO_FEATURES', 'polkit', 'polkit', '', d)} \
    python3 \
    python3-pip \
    python3-six \
    sqlite3 \
    ${@bb.utils.contains('DISTRO_FEATURES', 'pam', 'util-linux', '', d)} \
    "

PV = "1.1.0+git${SRCPV}"
SRCREV = "4c600fc973effc9dad335f65c3dea243bd5da225"

SRC_URI = " \
    git://github.com/WebThingsIO/gateway.git;protocol=https;branch=master \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    file://webthings-gateway.conf \
    file://webthings-gateway.profile \
    file://webthings-gateway.service \
    file://package_paths_fixup.sh \
    "

S = "${WORKDIR}/git"

inherit base pkgconfig systemd extrausers

EXTRA_USERS_PARAMS = " \
    useradd webthings; \
    usermod -s /sbin/nologin webthings; \
    "

PACKAGECONFIG ??= "internet-radio mdns mqtt network-presence video"

PACKAGECONFIG[internet-radio] = ", , alsa-utils"
PACAKGECONFIG[mdns] = ", , avahi-daemon"
PACAKGECONFIG[mqtt] = ", , mosquitto"
PACKAGECONFIG[network-presence] = ", , iputils"
PACKAGECONFIG[video] = ", , ffmpeg"

INSTALL_BASE = "/opt/${PN}"

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
    # fsevent install prevents build break, even though not used on linux
    npm \
        --user root \
        --arch=${TARGET_ARCH} \
        --build-from-source=true \
        --loglevel=verbose \
        --python=${STAGING_DIR_NATIVE}${bindir}/python3-native/python3 \
        --release=true \
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
    ./node_modules/.bin/webpack --stats verbose

    echo '* prune tree *************************************'
    npm prune --production

    echo '* clean up ***************************************'
    rm -rf node_modules/sqlite3/build*
    rm -rf node_modules/sqlite3/Dockerfile
    rm -rf node_modules/sqlite3/tools/docker/
    rm -rf node_modules/node-gyp/gyp/samples/
    rm -rf node_modules/fsevents/*.node

    find node_modules -iname .deps -print0 | xargs -0 -n1 rm -rf
    find node_modules -iname obj.target -print0 | xargs -0 -n1 rm -rf

    find node_modules -iname package.json -print0 | xargs -0 -n1 sed -i "s|${S}|${INSTALL_BASE}|g"
}

do_install() {

    cd ${S}

    # QA package fix.  We don't have /usr/bin/python symlink
    sed -i 's|#!/usr/bin/python|#!/usr/bin/env python3|g' pagekite.py

    # fix up run script
    sed -i 's|\${HOME}/webthings/gateway|/opt/webthings-gateway|g' run-app.sh

    install -Dm644 ${WORKDIR}/${PN}.conf    ${D}${INSTALL_BASE}/config/default.js

    install -m755 run-app.sh        ${D}${INSTALL_BASE}/
    install -m755 pagekite.py       ${D}${INSTALL_BASE}/
    install -m644 global.d.ts       ${D}${INSTALL_BASE}/
    install -m644 package.json      ${D}${INSTALL_BASE}/
    install -m644 package-lock.json ${D}${INSTALL_BASE}/
    install -m644 LICENSE           ${D}${INSTALL_BASE}/

    cp -r build                     ${D}${INSTALL_BASE}/
    cp -r node_modules              ${D}${INSTALL_BASE}/
    cp -r src                       ${D}${INSTALL_BASE}/
    cp -r static                    ${D}${INSTALL_BASE}/
    cp -r tools                     ${D}${INSTALL_BASE}/

    find ${D}${INSTALL_BASE} -type d -exec chmod 0755 '{}' +

    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -Dm644 ${WORKDIR}/${PN}.service  ${D}${systemd_system_unitdir}/${PN}.service
    fi
}

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}', '', d)}"
SYSTEMD_SERVICE_${PN} += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}.service', '', d)}"

FILES_${PN} += "\
    /opt \
    ${systemd_system_unitdir} \
    "
