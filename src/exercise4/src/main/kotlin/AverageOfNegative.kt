package org.example

class AverageOfNegative {
    private var list: MutableList<Int> = mutableListOf()
    private var num = 0

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

    fun getNum(): Int {
        return this.num
    }

    fun addElements(vararg elements: Int) {
        list.clear()

        var counter = 0
        for (element in elements) {
            if (counter >= num) break
            list.add(element)
            ++counter
        }
    }

    fun calcAverage(): Int? {
        var res: Int = 0

        if (num > 0) {
            var count = 0
            for (el in list) {
                if (el < 0) {
                    res += el
                    count++
                }
            }

            if (count == 0) {
                println("There are no negative elements")
                return null
            }

            res /= count
        }

        return res
    }
}