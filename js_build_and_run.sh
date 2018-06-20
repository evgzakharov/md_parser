#!/usr/bin/env bash -ex

RUN_FILE=${1:-'./files/file1.md'}

# build js code
./gradlew :js_parser:build

# build js bundle
npm run --prefix js_parser build

# run bundle and pass file to parse as argument
node js_parser/build/bundle/main.bundle.js ${RUN_FILE}
