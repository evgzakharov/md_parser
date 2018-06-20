#!/usr/bin/env bash -ex

RUN_FILE=${1:-'./files/file1.md'}

# build applicatoin to jar
./gradlew :jvm_parser:shadowJar

# run jar and pass file to parse as argument
java -jar jvm_parser/build/libs/jvm_parser-all.jar ${RUN_FILE}
