SUMMARY = "Gifsicle is a command-line tool for creating, editing, and getting information about GIF images and animations."
AUTHOR = "Eddie Kohler"
HOMEPAGE = "http://www.lcdf.org/gifsicle/"
BUGTRACKER = "https://github.com/kohler/gifsicle/issues"
SECTION = "graphics"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "http://www.lcdf.org/gifsicle/gifsicle-${PV}.tar.gz"
SRC_URI[md5sum] = "1a005d28496def26c5f2ce9a56f54233"
SRC_URI[sha1sum] = "5a22168a31c098212061f56b59d59eb0c7fcca00"
SRC_URI[sha256sum] = "92f67079732bf4c1da087e6ae0905205846e5ac777ba5caa66d12a73aa943447"
SRC_URI[sha384sum] = "d99b26b5f4bacb51c0a54ee49eebd84b7fd70bfc9878853fa8059db973827de5453a301b72dacd0f865ec1ca534476b0"
SRC_URI[sha512sum] = "1ace2c9597a405d69bb9dfa24764a3d7c7dd9864e1832d25a4a7ad2e32780038206b889711846d6e4dbc7189482d0d03874f18d86966ebffbc4ee10569c390d3"

inherit autotools

EXTRA_OECONF = "--disable-gifview --disable-gifdiff"

BBCLASSEXTEND = "native"
