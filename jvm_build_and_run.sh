#!/usr/bin/env bash -ex

./gradlew :jvm_parser:clean :jvm_parser:shadowJar
java -jar jvm_parser/build/libs/jvm_parser-all.jar ./files/file1.md