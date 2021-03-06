package ru.alfabank.ecomm.dcreator.common

expect class File {
    constructor(parent: File, path: String)

    constructor(path: String)

    fun exists(): Boolean

    fun getParentFile(): File

    fun getAbsolutePath(): String
}

expect suspend fun <R> File.withLines(action: suspend (Sequence<String>) -> R): R

expect suspend fun File.writeData(data: String): Unit