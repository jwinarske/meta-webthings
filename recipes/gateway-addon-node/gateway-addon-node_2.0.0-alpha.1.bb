SUMMARY = "Bindings for WebThings Gateway add-ons"
HOMEPAGE = "https://github.com/WebThingsIO/gateway-addon-node"

include ${PN}-license.inc

SRC_URI = " \
    gitsm://github.com/WebThingsIO/gateway-addon-node.git;protocol=https;branch=master \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    "

PV = "2.0.0-alpha.1+git${SRCPV}"
SRCREV = "2.0.0-alpha.1"

S = "${WORKDIR}/git"

inherit npm
