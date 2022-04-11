inherit pkgconfig

DEPENDS += "openssl sqlite3"

CARGO_BUILD_FLAGS += "--features sqlite"
