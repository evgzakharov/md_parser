# md_parser

[![travis build](https://travis-ci.org/evgzakharov/md_parser.svg?branch=master)](https://travis-ci.org/evgzakharov/md_parser)
[![MIT Licence](https://img.shields.io/badge/licence-MIT-blue.svg)](https://github.com/evgzakharov/md_parser/blob/master/LICENSE)

## Project contains parser of `markdown` text with custom extensions (like include, title etc.)

### Structure:

* __common_nodes__ - contains parser nodes 
* __common_parser__ - contains common markdown parser implementation with custom extensions like include, title etc
* __jvm_parser__ - JVM realization of __common_parser__
* __js_parser__ - JS realization of __common_parser__ (with translated TypeScript declaration of NodeJs to Kotlin)

### Build requirements:
- installed `java 8`
- installed `node 10`
