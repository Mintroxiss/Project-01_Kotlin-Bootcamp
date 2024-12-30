package org.example

fun main() {
    while (true) {
        try {
            val aX = readln().toDouble()
            val aY = readln().toDouble()
            val bX = readln().toDouble()
            val bY = readln().toDouble()
            val cX = readln().toDouble()
            val cY = readln().toDouble()

            val trianglePerimeter = TrianglePerimeter(aX, aY, bX, bY, cX, cY)

            val perimeter = trianglePerimeter.calcPerimeter()
            if (perimeter >= 0.001) {
                println("Perimeter: $perimeter")
            }

            break
        } catch (e: NumberFormatException) {
            println("Couldn't parse a number. Please, try again")
        }
    }
}