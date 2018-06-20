#!/usr/bin/env bash -ex

RUN_FILE=${1:-'./files/all.md'}

# run bundle and pass file to parse as argument
node js_parser/build/bundle/main.bundle.js ${RUN_FILE}
