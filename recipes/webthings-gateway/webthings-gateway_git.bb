# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Web of Things gateway"
HOMEPAGE = "https://webthings.io"

include ${PN}-license.inc

DEPENDS += " \
    jq-native \
    "

RDEPENDS_${PN} += " \
    bash \
    boost \
    curl \
    libffi \
    libpng \
    libusb1 \
    make \
    nodejs \
    python3 \
    python3-pip \
    python3-gateway-addon \
    udev \
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

SYSTEMD_SERVICE_${PN} += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}.service', '', d)}"
SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}', '', d)}"

npm_do_install[no_exec] = "1"
do_install() {

    cd ${NPM_BUILD}/lib/node_modules/${PN}

    install -d ${STAGING_DIR_TARGET}/opt/${PN}

    cp -r node_modules "${STAGING_DIR_TARGET}/opt/${PN}/"
    cp -r src          "${STAGING_DIR_TARGET}/opt/${PN}/"
    cp -r static       "${STAGING_DIR_TARGET}/opt/${PN}/"

    # missing webpack
    # cp -r build        "${STAGING_DIR_TARGET}/opt/${PN}/"
    # find "${STAGING_DIR_TARGET}/opt/${PN}" -type d -exec chmod 0755 '{}' +

    install ${S}/LICENSE             "${STAGING_DIR_TARGET}/opt/${PN}/LICENSE"
    install ${S}/package.json        "${STAGING_DIR_TARGET}/opt/${PN}/package.json"
    install ${S}/package-lock.json   "${STAGING_DIR_TARGET}/opt/${PN}/package-lock.json"

    cd ${WORKDIR}
    
    install -Dm755 ${PN}.sh          "${STAGING_DIR_TARGET}${bindir}/${PN}.sh"
    install -Dm644 ${PN}.conf        "${STAGING_DIR_TARGET}/opt/${PN}/config/default.js"
    
    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -Dm644 ${PN}.service     "${D}${systemd_system_unitdir}/${PN}.service"
    fi
}

FILES_${PN} = "\
    ${bindir} \
    /opt/${PN} \
    ${systemd_system_unitdir} \
    "
