package org.example

fun main() {
    while (true) {
        try {
            val averageOfNegative = AverageOfNegative()

            if (!averageOfNegative.setNum(readln().toInt())) {
                val input = readlnOrNull() ?: return
                val inputNumbers = input.split(" ").map { it.toInt() }
                averageOfNegative.addElements(*inputNumbers.toIntArray())

                val res = averageOfNegative.calcAverage()
                if (res != null) {
                    println(res)
                }
            }

            break
        } catch (e: NumberFormatException) {
            println("Couldn't parse a number. Please, try again")
        }
    }
}