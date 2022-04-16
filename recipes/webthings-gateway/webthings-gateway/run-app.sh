#!/bin/bash

set -e -x

WEBTHINGS_HOME="${WEBTHINGS_HOME:=${HOME}/.webthings}"

run_app() {

  (timedatectl set-local-rtc 0 && timedatectl set-ntp 1) || true

  echo "node version"
  node --version
  echo "Starting gateway ..."
  systemctl start webthings-gateway
}

if [ ! -f .post_upgrade_complete ]; then
  ./tools/post-upgrade.sh
fi

mkdir -p "${WEBTHINGS_HOME}/log"

if [ -f "${WEBTHINGS_HOME}/log/run-app.log" ]; then
  rm -f "${WEBTHINGS_HOME}/log/run-app.log"
fi

run_app