inherit pkgconfig

DEPENDS += "openssl sqlite3"

CARGO_BUILD_FLAGS += "--features sqlite"

cargo_do_install_append() {

    mv ${D}${bindir}/main ${D}${bindir}/${PN}

    install -d "${D}${datadir}/${PN}/"

    cd ${WORKDIR}
    install -Dm644 config.toml   "${D}${datadir}/${PN}/"
    install -Dm644 pagekite.toml "${D}${datadir}/${PN}/"
    install -Dm644 pdns.toml     "${D}${datadir}/${PN}/"
}

FILES_${PN} += "${datadir}"
