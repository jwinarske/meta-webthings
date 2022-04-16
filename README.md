# meta-webthings

OpenEmbedded layer for latest WebThingsIO releases.

# Layer Status
  Needs more testing around runtime dependencies and WiFi/BT
  ie. system info plugin is depedendent on `iw`
  ie. Update service is running, but not actually tested with an update.

## Dynamic Dependency
* meta-rust

If `rust-layer` is not present (meta-rust), the rust recipes are not available.

## Available recipes

* gifsicle - used by webthings-gateway during build
* python3-gateway-addon
* python3-singleton-decorator
* webthings-gateway - WebThings Gateway
* webthings-registration-server - The registration server for WebThings Gateway
* webthing-rust-examples - Rust implementation of a Web Thing server

## Setup

After first login run /opt/gateway/run-app.sh once.
It enables/starts the webthings-gateway service.

webthings-gateway expects it will run as root.  This will be updated in the future.