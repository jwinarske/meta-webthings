SUMMARY = "Web of Things gateway"
HOMEPAGE = "https://webthings.io"

include ${PN}-license.inc

DEPENDS += " \
    nasm-native \
    nodejs-native \
    python3-native \
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

inherit base systemd extrausers pkgconfig

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


do_compile() {
    export HOME="${WORKDIR}"
    export GYP_DEFINES="sysroot=${STAGING_DIR_TARGET}"
    export LD="${CXX}"

    cd ${S}
    
    npm install fsevents@latest -f --save-optional
    npm install \
        --arch=${TARGET_ARCH} \
        --build-from-source=true \
        --python=${STAGING_DIR_NATIVE}${bindir}/python3-native \
        --release=true \
        --sqlite=${D}${libdir} \
        --target-arch=${TARGET_ARCH}

    ./node_modules/.bin/webpack
    npm prune --production

    # Remove references to $srcdir
    find node_modules -name package.json -exec sh -c '
        tmp="$(mktemp)"
        f="{}"
        jq ".|=with_entries(select(.key|test(\"^_.+|^man\$\")|not))" "$f" > "$tmp"
        mv "$tmp" "$f"
        chmod 644 "$f"
        ' \;

    rm -rf node_modules/sqlite3/build-tmp-napi-v3
}

do_install() {

    sed -i 's|#!/usr/bin/python|#!/usr/bin/python3|g' pagekite.py

    mkdir -p "${D}/opt/${PN}"

    cp -r "${S}/build" "${D}/opt/${PN}/"
    cp -r "${S}/node_modules" "${D}/opt/${PN}/"
    cp -r "${S}/src" "${D}/opt/${PN}/"
    cp -r "${S}/static" "${D}/opt/${PN}/"

    find "${D}/opt/${PN}" -type d -exec chmod 0755 '{}' +

    install -Dm644 "${S}/${PN}.conf"        "${D}/opt/${PN}/config/default.js"
    install -Dm644 "${S}/package.json"      "${D}/opt/${PN}/package.json"
    install -Dm644 "${S}/package-lock.json" "${D}/opt/${PN}/package-lock.json"
    install -Dm644 "${S}/LICENSE"           "${D}/opt/${PN}/LICENSE"

    install -Dm755 ${WORKDIR}/${PN}.sh   "${D}${bindir}/${PN}"
    install -Dm644 ${WORKDIR}/${PN}.conf "${D}/opt/${PN}/config/default.js"

    if ${@bb.utils.contains('DISTRO_FEATURES', 'systemd', 'true', 'false', d)}; then
        install -Dm644 ${PN}.service     "${D}${systemd_system_unitdir}/${PN}.service"
    fi
}

SYSTEMD_PACKAGES = "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}', '', d)}"
SYSTEMD_SERVICE_${PN} += "${@bb.utils.contains('DISTRO_FEATURES', 'systemd', '${PN}.service', '', d)}"

FILES_${PN} += "\
    /opt \
    ${systemd_system_unitdir} \
    "
