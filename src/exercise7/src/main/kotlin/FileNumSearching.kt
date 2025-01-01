package org.example

import java.io.File
import java.io.FileNotFoundException

class FileNumSearching {
    private var filePath: String = ""
    private var num = 0
    private val list: MutableList<Double> = mutableListOf()

    fun setFilePath(filePath: String) {
        this.filePath = filePath
    }

    fun analyseFile(): Boolean {
        var res = false

        try {
            val fileContent = File(filePath).readLines()
            res = setNum(fileContent[0])
            if (!res) res = addElements(fileContent[1])
        } catch (e: FileNotFoundException) {
            println("Input error. File isn't exist")
            res = true
        }

        return res
    }

    fun outInfo() {
        println(num)
        for (el in list) print("$el ")
        println()
    }

    fun saveMinMax() {
        var minimum = list[0]
        var maximum = list[0]
        for (element in list) {
            if (minimum > element) minimum = element
            if (maximum < element) maximum = element
        }

        val file = File("src/files/result.txt")
        file.createNewFile()

        file.writeText("$minimum $maximum")

        println("Saving min and max values in file")
    }

    private fun setNum(line: String): Boolean {
        var res = false

        try {
            val num = line.toInt()
            if (num > 0) {
                this.num = num
            } else {
                this.num = 0
                res = true
            }
        } catch (e: NumberFormatException) {
            res = true
        }

        if (res) println("Input error. Size <= 0")

        return res
    }

    private fun addElements(line: String): Boolean {
        var res = false

        list.clear()

        var counter = 0
        for (elementStr in line.split(" ")) {
            val element: Double
            try {
                element = elementStr.toDouble()
            } catch (e: NumberFormatException) {
                continue
            }

            if (counter >= num) break
            list.add(element)
            ++counter
        }
        if (counter < num) {
            println("Input error. Insufficient number of elements")
            res = true
        }

        return res
    }
}