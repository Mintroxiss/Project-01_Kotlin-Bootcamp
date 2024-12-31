package org.example

import java.util.Collections

class Sorting {

    private var num = 0
    private var list: MutableList<Double> = mutableListOf()

    fun setNum(num: Int): Boolean {
        if (num > 0) {
            this.num = num
        } else {
            println("Input error. Size <= 0")
            this.num = 0
            return true
        }

        return false
    }

    fun addElements(vararg elements: Double) {
        list.clear()

        var counter = 0
        for (element in elements) {
            if (counter >= num) break
            list.add(element)
            ++counter
        }
        if (counter < num) {
            for (i in 0 until num - counter) {
                list.add(0.0)
            }
        }

    }

    fun sortList() {
        var startIndex = 0

        while (startIndex < num) {
            var minIndex: Int = startIndex
            for (i in startIndex until num) {
                if (list[minIndex] > list[i]) {
                    minIndex = i
                }
            }

            Collections.swap(list, startIndex, minIndex)
            ++startIndex
        }
    }

    fun outList() {
        for (el in list) print("$el ")
        println()
    }
}