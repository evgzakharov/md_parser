package ru.alfabank.ecomm.dcreator.parser

import ru.alfabank.ecomm.dcreator.common.File
import ru.alfabank.ecomm.dcreator.common.withLines
import ru.alfabank.ecomm.dcreator.common.writeData
import ru.alfabank.ecomm.dcreator.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MarkdownParserTest {
    @Test
    fun test_markdown_parser() = runTest {
        val testDir = File("../common_parser/src/test/resources/parserFull")
        val markdownParser = MarkdownParser(testDir)

        val result = markdownParser.parse(File(testDir, "file1.md"))
            .toString()

        val actualLines = result
            .split("\n")

        File(testDir, "expect.txt").withLines { expect ->
            val expectLines = expect.toList()

            assertEquals(expectLines.size, actualLines.size)
            expectLines.forEachIndexed { index, expectedLine ->
                assertEquals(expectedLine, actualLines[index], "error in line: $index")
            }
        }
    }
}