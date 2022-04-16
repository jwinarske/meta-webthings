#!/bin/bash

# Performs any necessary steps after the main upgrade process is complete.

# Upgrade gateway-addon Python package
# pip3 install --upgrade -r "/opt/gateway/requirements.txt"

# Enable system services
systemctl enable webthings-gateway.service
# webthings-gateway.service will be started by upgrade.sh
systemctl enable webthings-gateway.check-for-update.timer
systemctl start  webthings-gateway.check-for-update.timer


# If the node version changed, and we have a user profile, we need to update
# add-ons
if [ -d "$HOME/.webthings" ]; then
  # trigger on version change
  if [[ ! -f "$HOME/webthings/gateway_old/.nvmrc" ||
        $(sha256sum "$HOME/webthings/gateway_old/.nvmrc") != $(sha256sum "$HOME/webthings/gateway/.nvmrc") ]]; then
    cd /opt/gateway
    ./tools/update-addons.sh
    cd -
  fi
fi

# Link the gateway-addon module globally
cd "/opt/gateway/node_modules/gateway-addon"
npm link
cd -

# Finished
touch .post_upgrade_complete