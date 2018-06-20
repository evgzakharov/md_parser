#!/usr/bin/env bash -ex

# build js code
./gradlew :js_parser:build

# build js bundle
npm run --prefix js_parser build