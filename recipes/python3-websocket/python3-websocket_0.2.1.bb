SUMMARY = "Websocket implementation for gevent"
HOMEPAGE = "http://pypi.python.org/pypi/websocket"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=13484d110cf0f7e0713493cb09a8601c"

SRC_URI = "https://files.pythonhosted.org/packages/f2/6d/a60d620ea575c885510c574909d2e3ed62129b121fa2df00ca1c81024c87/websocket-${PV}.tar.gz"
SRC_URI[md5sum] = "2ded54ca7c61a9a0afb93fe2666dea76"
SRC_URI[sha1sum] = "c9b52754a14b762f440c83bfd6de6ea1d839ad30"
SRC_URI[sha256sum] = "42b506fae914ac5ed654e23ba9742e6a342b1a1c3eb92632b6166c65256469a4"
SRC_URI[sha384sum] = "c772fbe21aa8ae6ff44de84a041e17bae5aa11383fab30c8297aa5570001f51e2e621e902bbce5523b2e808182e15e9a"
SRC_URI[sha512sum] = "ec96ca712a52e547a02706dc241bbda6a6b87cddc3bcbd5eda98b2b01afd42057ec2e052df8bc8ae039f23a0412098ffc97a7d81ecbb1d79bbad027b85e682ab"

S = "${WORKDIR}/websocket-${PV}"

inherit setuptools3

RDEPENDS_${PN} += "\
    python3-gevent \
    python3-greenlet \
    python3-core \
    "
