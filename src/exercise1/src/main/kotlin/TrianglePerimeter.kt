package org.example

import kotlin.math.pow
import kotlin.math.round
import kotlin.math.sqrt

class TrianglePerimeter() {

    constructor(
        vertexAX: Double,
        vertexAY: Double,
        vertexBX: Double,
        vertexBY: Double,
        vertexCX: Double,
        vertexCY: Double
    ) : this() {
        vertexA[0] = vertexAX
        vertexA[1] = vertexAY
        vertexB[0] = vertexBX
        vertexB[1] = vertexBY
        vertexC[0] = vertexCX
        vertexC[1] = vertexCY
    }

    private val vertexA = Array(2) { 0.0 }
    private val vertexB = Array(2) { 0.0 }
    private val vertexC = Array(2) { 0.0 }

    fun setVertexA(x: Double, y: Double) {
        vertexA[0] = x
        vertexA[1] = y

    }

    fun setVertexB(x: String, y:String) {
        vertexB[0] = x.toDouble()
        vertexB[1] = y.toDouble()
    }

    fun setVertexC(x: String, y:String) {
        vertexC[0] = x.toDouble()
        vertexC[1] = y.toDouble()
    }

    // Вычисляет периметр треугольника
    fun calcPerimeter(): Double {
        val sideAB = sqrt((vertexB[0] - vertexA[0]).pow(2.0) + (vertexB[1] - vertexA[1]).pow(2.0))
        val sideBC = sqrt((vertexB[0] - vertexC[0]).pow(2.0) + (vertexB[1] - vertexC[1]).pow(2.0))
        val sideAC = sqrt((vertexC[0] - vertexA[0]).pow(2.0) + (vertexC[1] - vertexA[1]).pow(2.0))

        if (sideAB + sideBC <= sideAC || sideAB + sideAC <= sideBC || sideAC + sideBC <= sideAB) {
            println("It's not a triangle")
            return -1.0
        }

        return round((sideAB + sideBC + sideAC) * 1000) / 1000
    }
}