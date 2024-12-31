package org.example

fun main() {
    while (true) {
        try {
            val sorting = Sorting()

            if (!sorting.setNum(readln().toInt())) {
                val input = readlnOrNull() ?: return
                val inputNumbers = input.split(" ").map { it.toDouble() }
                sorting.addElements(*inputNumbers.toDoubleArray())

                sorting.sortList()

                sorting.outList()
            }

            break
        } catch (e: NumberFormatException) {
            println("Couldn't parse a number. Please, try again")
        }
    }
}