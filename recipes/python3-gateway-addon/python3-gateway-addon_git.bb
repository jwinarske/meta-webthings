SUMMARY = "Bindings for WebThings Gateway add-ons"
HOMEPAGE = "https://github.com/WebThingsIO/gateway-addon-python"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=9741c346eef56131163e13b9db1241b3 \
                    file://gateway_addon/schema/LICENSE;md5=9741c346eef56131163e13b9db1241b3"

SRC_URI = "gitsm://github.com/WebThingsIO/gateway-addon-python;protocol=https;branch=master"

# Modify these as desired
PV = "1.0.0+git${SRCPV}"
SRCREV = "dcde5d0f7cce69801c6b52c6ec5627084d480e69"

S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS_${PN} += "\
    python3-core \
    python3-datetime \
    python3-json \
    python3-jsonschema \
    python3-pprint \
    python3-shell \
    python3-singleton-decorator \
    python3-sqlite3 \
    python3-websocket \
    "

