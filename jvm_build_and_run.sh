#!/usr/bin/env bash -ex

RUN_FILE=${1:-'./files/file1.md'}

./gradlew :jvm_parser:clean :jvm_parser:shadowJar
java -jar jvm_parser/build/libs/jvm_parser-all.jar ${RUN_FILE}