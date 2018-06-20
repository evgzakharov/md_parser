#!/usr/bin/env bash -ex

RUN_FILE=${1:-'./files/all.md'}

# run jar and pass file to parse as argument
java -jar jvm_parser/build/libs/jvm_parser-all.jar ${RUN_FILE}
