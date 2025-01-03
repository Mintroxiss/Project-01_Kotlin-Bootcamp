package org.example

class Filtration {
    private var num = 0
    private var list: MutableList<String> = mutableListOf()
    private var substring = ""

    private var counter = 0

    fun setNum(num: Int):Boolean {
        if (num <= 0) return true
        this.num = num

        return false
    }

    fun getNum(): Int {
        return this.num
    }

    fun addElement(element: String) {
        ++counter
        if (num > 0 && counter <= num) {
            list.add(element)
        } else {
            --counter
        }
    }

    fun setSubstring(substring: String) {
        this.substring = substring
    }

    fun peekStrings(): MutableList<String> {
        val answer: MutableList<String> = mutableListOf()
        for (str in list) {
            if (str.contains(substring)) {
                answer.add(str)
            }
        }

        return answer
    }
}