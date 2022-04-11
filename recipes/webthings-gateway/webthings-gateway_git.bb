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

PV = "1.1.0+git${SRCPV}"
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

PACKAGECONFIG ??= "internet-radio mdns mqtt network-presence video"

PACKAGECONFIG[internet-radio] = ", , alsa-utils"
PACAKGECONFIG[mdns] = ", , avahi-daemon"
PACAKGECONFIG[mqtt] = ", , mosquitto"
PACKAGECONFIG[network-presence] = ", , iputils"
PACKAGECONFIG[video] = ", , ffmpeg"

EXTRA_USERS_PARAMS = " \
    useradd webthings; \
    usermod -s /usr/sbin/nologin webthings; \
    "

npm_do_install_append() {

    rm -rf ${D}${nonarch_libdir}

    cd ${NPM_BUILD}/lib/node_modules/${PN}

    install -d "${D}/opt/${PN}"

    cp -r src          "${D}/opt/${PN}/"
    cp -r static       "${D}/opt/${PN}/"
    cp -r node_modules "${D}/opt/${PN}/"

    rm -rf "${D}/opt/${PN}/node_modules/sqlite3/build-tmp-napi-v3/"
    rm -rf "${D}/opt/${PN}/node_modules/sqlite3/tools/docker/"
    rm -rf "${D}/opt/${PN}/node_modules/sqlite3/Dockerfile"
    rm -rf "${D}/opt/${PN}/node_modules/node-gyp/gyp/samples/"
    rm -rf "${D}/opt/${PN}/node_modules/node-gyp/test/"

    # pagekite is known to work on python3
    sed -i 's|#!/usr/bin/python|#!/usr/bin/python3|g' pagekite.py

    # missing webpack
    # cp -r build        "${D}/opt/${PN}/"
    # find "${D}/opt/${PN}" -type d -exec chmod 0755 '{}' +

    cd ${S}
    install LICENSE           "${D}/opt/${PN}/LICENSE"
    install package.json      "${D}/opt/${PN}/package.json"
    install package-lock.json "${D}/opt/${PN}/package-lock.json"

    cd ${WORKDIR}    
    install -Dm755 ${PN}.sh   "${D}${bindir}/${PN}.sh"
    install -Dm644 ${PN}.conf "${D}/opt/${PN}/config/default.js"
    
    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -Dm644 ${PN}.service     "${D}${systemd_system_unitdir}/${PN}.service"
    fi
}

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}', '', d)}"
SYSTEMD_SERVICE_${PN} += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}.service', '', d)}"

FILES_${PN} += "\
    /opt/${PN} \
    ${systemd_system_unitdir} \
    "
