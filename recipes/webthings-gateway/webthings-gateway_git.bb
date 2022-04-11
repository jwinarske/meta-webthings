SUMMARY = "Web of Things gateway"
HOMEPAGE = "https://webthings.io"

include ${PN}-license.inc

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
    nodejs-npm \
    ${@bb.utils.contains('DISTRO_FEATURES', 'polkit', 'polkit', '', d)} \
    python3 \
    python3-gateway-addon \
    python3-pip \
    python3-six \
    sqlite3 \
    ${@bb.utils.contains('DISTRO_FEATURES', 'pam', 'util-linux', '', d)} \
    "

PV = "1.0.0+git${SRCPV}"
SRCREV = "4c600fc973effc9dad335f65c3dea243bd5da225"

SRC_URI = " \
    git://github.com/WebThingsIO/gateway.git;protocol=https;branch=master \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    file://webthings-gateway.conf \
    file://webthings-gateway.profile \
    file://webthings-gateway.service \
    file://webthings-gateway.sh \
    "

S = "${WORKDIR}/git"

inherit npm systemd extrausers

EXTRA_USERS_PARAMS = " \
    useradd webthings; \
    usermod -s /usr/sbin/nologin webthings; \
    "

PACKAGECONFIG ??= "internet-radio mdns mqtt network-presence video"

PACKAGECONFIG[internet-radio] = ", , alsa-utils"
PACAKGECONFIG[mdns] = ", , avahi-daemon"
PACAKGECONFIG[mqtt] = ", , mosquitto"
PACKAGECONFIG[network-presence] = ", , iputils"
PACKAGECONFIG[video] = ", , ffmpeg"

npm_do_install_prepend() {

    cd ${NPM_BUILD}/lib/node_modules/${PN}

    npm --cache "${NPM_CACHE}" install -D

    ./node_modules/.bin/webpack

    npm --cache "${NPM_CACHE}" prune --production

    rm -rf ./node_modules/sqlite3/build-tmp-napi-v3/
    # rm -rf ./node_modules/sqlite3/tools/docker/
    # rm -rf ./node_modules/sqlite3/Dockerfile
    # rm -rf ./node_modules/node-gyp/gyp/samples/
    # rm -rf ./node_modules/node-gyp/test/

    # This is to pass package QA step, as we don't have a python symlink on target
    # this can be removed if python3_%.bbappend is added, which creates /usr/bin/python symlink
    sed -i 's|#!/usr/bin/python|#!/usr/bin/python3|g' pagekite.py
}

npm_do_install_append() {

    # install -d "${D}/opt/${PN}"

    cp -r build        "${D}/opt/${PN}/"

    # install ${S}/LICENSE           "${D}${nonarch_libdir}/${PN}/LICENSE"
    # install ${S}/package.json      "${D}${nonarch_libdir}/${PN}/package.json"

    install ${S}/package-lock.json "${D}${nonarch_libdir}/${PN}/package-lock.json"

    cd ${WORKDIR}
    install -Dm755 ${PN}.sh   "${D}${bindir}/${PN}"
    install -Dm644 ${PN}.conf "${D}/opt/${PN}/config/default.js"
    
    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -Dm644 ${PN}.service     "${D}${systemd_system_unitdir}/${PN}.service"
    fi
}

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}', '', d)}"
SYSTEMD_SERVICE_${PN} += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}.service', '', d)}"

FILES_${PN} += "\
    ${systemd_system_unitdir} \
    "
