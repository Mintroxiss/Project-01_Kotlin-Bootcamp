package org.example

fun main() {
    val consistency = Consistency()
    var i = 0
    while (true) {
        ++i
        try {
            val res = consistency.addElement(readln().toInt())

            if (res != -1)  {
                println("The sequence is not ordered from the ordinal number of the number ${res + 1}")
                break
            }
        } catch (e: NumberFormatException) {
            if (i == 1)
                println("Input error")
            else
                println("The sequence is ordered in ascending order")
            break
        }
    }
}