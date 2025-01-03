package org.example

class Consistency {
    private var num = 0
    private var arr : Array<Int?> = Array(1) { null }

    fun addElement(newElement: Int): Int {
        ++num
        val newArr = arr.copyOf(num)
        newArr[num - 1] = newElement
        arr = newArr

        if (num > 1)
            for (i in 1 until num) {
                if (arr[i]!! < arr[i - 1]!!) {
                    return if (i - 2 >= 0) {
                        if (arr[i]!! > arr[i - 2]!!) i - 1
                        else i
                    } else 0
                }
            }

        return -1
    }
}