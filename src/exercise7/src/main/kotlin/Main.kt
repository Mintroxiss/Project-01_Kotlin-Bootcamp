package org.example

fun main() {
    val fileNumSearching = FileNumSearching()

    fileNumSearching.setFilePath(readlnOrNull().toString())
    if (!fileNumSearching.analyseFile()) {
        fileNumSearching.outInfo()
        fileNumSearching.saveMinMax()
    }
}