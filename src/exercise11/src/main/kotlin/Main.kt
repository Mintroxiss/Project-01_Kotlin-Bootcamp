package org.example

import kotlin.math.abs

// Используется алгоритм Евклида для поиска НОД
fun Int.gcd(other: Int): Int {
    var a = this
    var b = other

    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }
    return abs(a)
}

fun main() {
    var a: Int
    var b: Int

    while (true) {
        try {
            val numbers = readln().split(" ")
            a = numbers[0].toInt()
            b = numbers[1].toInt()

            break
        } catch (e: NumberFormatException) {
            println("Couldn't parse a number. Please, try again")
        }
    }

    println(a.gcd(b))
}
