package ru.alfabank.ecomm.dcreator.jvm

import kotlinx.coroutines.experimental.runBlocking
import ru.alfabank.ecomm.dcreator.parser.MarkdownParser
import java.io.File

fun main(args: Array<String>) = runBlocking {
    if (args.isEmpty())
        throw RuntimeException("there is no input file")

    val fileToParse = File(args.first())
    if (!fileToParse.exists() || fileToParse.isDirectory)
        throw RuntimeException("file ${fileToParse.absolutePath} not found")

    val markdownParser = MarkdownParser(fileToParse.parentFile)
    val parseResult = markdownParser.parse(fileToParse)

    println(parseResult)
}