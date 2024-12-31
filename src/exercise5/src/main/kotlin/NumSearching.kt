package org.example

import kotlin.math.abs

class NumSearching {
    private var num = 0
    private val list: MutableList<Int> = mutableListOf()
    private var array: IntArray? = null

    fun setNum(num: Int): Boolean {
        if (num > 0) {
            this.num = num
        } else {
            this.num = 0
            println("Input error. Size <= 0")
            return true
        }

        return false
    }

    fun addElements(vararg elements: Int) {
        list.clear()

        var counter = 0
        for (element in elements) {
            if (counter >= num) break
            list.add(element)
            ++counter
        }
        if (counter < num) {
            for (i in 0 until num - counter) {
                list.add(0)
            }
        }
    }

    fun searchElements() {
        val searchNums: MutableList<Int> = mutableListOf()

        var i = 0
        while (i < num) {
            val element = list[i]
            if (abs(element).toString().first().toString().toInt() == abs(element % 10)) searchNums.add(element)
            ++i
        }

        array = if (searchNums.isEmpty()) {
            null
        } else {
            searchNums.toIntArray()
        }
    }

    fun outSearchNums() {
        if (array != null) {
            for (element in array!!) {
                print("$element ")
            }
            println()
        } else
            println("There are no such elements")
    }
}