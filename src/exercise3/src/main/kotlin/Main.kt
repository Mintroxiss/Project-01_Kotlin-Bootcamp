package org.example

fun main() {
    val fibonaccInator = FibonaccInator()

    while (true) {
        try {
            fibonaccInator.setNumOfFibonacci(readln().toUInt())

            val res = fibonaccInator.startCountFibonacci()
            if (res != null) {
                println(res)
            }

            break
        } catch (e: NumberFormatException) {
            println("Couldn't parse a number. Please, try again")
        }
    }

}