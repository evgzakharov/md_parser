#!/usr/bin/env bash -ex

RUN_FILE=${1:-'./files/file1.md'}

./gradlew :js_parser:clean :js_parser:build
npm run --prefix js_parser build
node js_parser/build/bundle/main.bundle.js ${RUN_FILE}