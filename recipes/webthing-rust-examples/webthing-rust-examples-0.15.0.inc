CARGO_BUILD_FLAGS += "--examples"

cargo_do_install:append() {

    rm ${D}${bindir}/multiple_things-*
    rm ${D}${bindir}/single_thing-*

    mv ${D}${bindir}/multiple-things ${D}${bindir}/webthing-multiple
    mv ${D}${bindir}/single-thing    ${D}${bindir}/webthing-single
}
