CARGO_BUILD_FLAGS += "--examples"

cargo_do_install_append() {
    rm ${D}${bindir}/multiple_things-*
    rm ${D}${bindir}/single_thing-*
}
