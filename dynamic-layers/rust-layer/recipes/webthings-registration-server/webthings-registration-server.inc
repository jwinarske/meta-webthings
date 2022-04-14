
inherit pkgconfig

DEPENDS += " \
    openssl \
    sqlite3 \
    "

CARGO_BUILD_FLAGS += "--features sqlite"

SRC_URI += " \
    file://config.toml \
    file://pagekite.conf \
    file://pdns.conf \
    "

cargo_do_install_append() {

    mv ${D}${bindir}/main ${D}${bindir}/${PN}

    cd ${WORKDIR}

    install -d                   ${D}${datadir}/${PN}
    install -m 644 config.toml   ${D}${datadir}/${PN}/
    install -m 644 pagekite.conf ${D}${datadir}/${PN}/
    install -m 644 pdns.conf     ${D}${datadir}/${PN}/
}

FILES_${PN} += "${datadir}"
