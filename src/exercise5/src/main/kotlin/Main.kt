package org.example

fun main() {
    while (true) {
        val numSearching = NumSearching()

        try {
            if (!numSearching.setNum(readln().toInt())) {
                val input = readlnOrNull() ?: return
                val inputNumbers = input.split(" ").map { it.toInt() }
                numSearching.addElements(*inputNumbers.toIntArray())

                numSearching.searchElements()

                numSearching.outSearchNums()
            }

            break
        } catch (e: NumberFormatException) {
            println("Couldn't parse a number. Please, try again")
        }
    }
}