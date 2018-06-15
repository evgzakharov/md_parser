#!/usr/bin/env bash -ex

./gradlew :js_parser:clean :js_parser:build
npm run --prefix js_parser build
node js_parser/build/bundle/main.bundle.js ./files/file1.md