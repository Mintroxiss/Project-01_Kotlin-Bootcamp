package org.example

fun main() {
    val timeFormat = TimeFormat()

    while (true) {
        try {
            timeFormat.setTime(readln().toInt())
            timeFormat.separateTime()
            timeFormat.printTime()

            break
        } catch (e: NumberFormatException) {
            println("Couldn't parse a number. Please, try again")
        }
    }
}