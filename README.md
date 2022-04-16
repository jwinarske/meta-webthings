# meta-webthings

OpenEmbedded layer for latest WebThingsIO releases.

# Layer Status
* gifsicle - functional
* webthings-rust-examples - functional
* webthings-registration-server - functional
* webthings-gateway - not yet functional

## Dynamic Dependency
* meta-rust

If `rust-layer` is not present (meta-rust), the rust recipes are not available.

## Available recipes

* gifsicle - used by webthings-gateway during build
* webthings-gateway - WebThings Gateway
* webthings-registration-server - The registration server for WebThings Gateway
* webthing-rust-examples - Rust implementation of a Web Thing server
