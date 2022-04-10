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

    cd ${S}

    npm --cache "${NPM_CACHE}" prune --production

    # Remove references to $srcdir
    find node_modules -name package.json -exec sh -c '
        tmp="$(mktemp)"
        f="{}"
        jq ".|=with_entries(select(.key|test(\"^_.+|^man\$\")|not))" "$f" > "$tmp"
        mv "$tmp" "$f"
        chmod 644 "$f"
        ' \;

    rm -rf node_modules/sqlite3/build

    install -D ${STAGING_DIR_TARGET}/opt/${PN}

    cp -r build        "${STAGING_DIR_TARGET}/opt/${PN}/"
    cp -r node_modules "${STAGING_DIR_TARGET}/opt/${PN}/"
    cp -r src          "${STAGING_DIR_TARGET}/opt/${PN}/"
    cp -r static       "${STAGING_DIR_TARGET}/opt/${PN}/"

    find "${STAGING_DIR_TARGET}/opt/${PN}" -type d -exec chmod 0755 '{}' +

    install -Dm755 ${PN}.sh          "${STAGING_DIR_TARGET}${bindir}/${PN}.sh"
    install -Dm644 ${PN}.conf        "${STAGING_DIR_TARGET}/opt/${PN}/config/default.js"
    install -Dm644 package.json      "${STAGING_DIR_TARGET}/opt/${PN}/package.json"
    install -Dm644 package-lock.json "${STAGING_DIR_TARGET}/opt/${PN}/package-lock.json"
    install -Dm644 LICENSE           "${STAGING_DIR_TARGET}/opt/${PN}/LICENSE"

    install -d ${D}${systemd_system_unitdir}
    install -m 644 ${WORKDIR}/${PN}.service ${D}${systemd_system_unitdir}/${PN}.service
}

FILES_${PN} = "\
    ${bindir} \
    /opt/${PN} \
    ${systemd_system_unitdir} \
    "
