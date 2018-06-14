package ru.alfabank.ecomm.dcreator.js.main

import kotlinx.coroutines.experimental.promise
import ru.alfabank.ecomm.dcreator.common.File
import ru.alfabank.ecomm.dcreator.js.types.process
import ru.alfabank.ecomm.dcreator.parser.MarkdownParser

external val require: dynamic
external val module: dynamic

fun main(args: Array<String>) {
    if (require.main === module) {
        mainFun()
    }
}

fun mainFun() = promise {
    if (process.argv.size < 2)
        throw RuntimeException("there is no input file")

    val fileToParse = File(process.argv[2])
    if (!fileToParse.exists())
        throw RuntimeException("file ${fileToParse.rawPath} not found")

    val markdownParser = MarkdownParser(fileToParse.getParentFile())
    val parseResult = markdownParser.parse(fileToParse)

    println(parseResult)
}