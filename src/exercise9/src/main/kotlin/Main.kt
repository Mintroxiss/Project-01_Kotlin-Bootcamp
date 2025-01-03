package org.example

fun main() {
    val filtration = Filtration()

    while (true) {
        try {
            filtration.setNum(readln().toInt())
            break
        } catch (e: NumberFormatException) {
            println("Incorrect num")
        }
    }

    var i = 0
    while (i < filtration.getNum()) {
        filtration.addElement(readln())
        i++
    }

    filtration.setSubstring(readln())

    val elements = filtration.peekStrings()

    for (j in 0 until elements.size) {
        print(elements[j])
        if (j + 1 == elements.size)
            println(' ')
        else
            print(", ")
    }
}