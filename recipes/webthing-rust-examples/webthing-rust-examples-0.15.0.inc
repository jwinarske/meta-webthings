CARGO_BUILD_FLAGS += "--examples"

cargo_do_install_append() {
    rm ${D}${bindir}/multiple_things-*
    rm ${D}${bindir}/single_thing-*

    mv ${D}${bindir}/multiple_things ${D}${bindir}/webthing-multiple
    mv ${D}${bindir}/single_thing    ${D}${bindir}/webthing-single
}
