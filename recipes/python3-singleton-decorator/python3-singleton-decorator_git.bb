SUMMARY = "A testable singleton decorator"
HOMEPAGE = "https://github.com/Kemaweyan/singleton_decorator"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/Kemaweyan/singleton_decorator.git;protocol=https;branch=master"

PV = "1.0+git${SRCPV}"
SRCREV = "3c2259e27e6b24053fa5b417e13deaf14f43cfa5"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS_${PN} += "\
    python3-core \
    "