package org.example

fun main() {
    val list: MutableList<User> = mutableListOf()
    var num: Int

    while (true) {
        try {
            num = readln().toInt()
            break
        } catch (e: NumberFormatException) {
            println("Couldn't parse a number. Please, try again")
        }
    }

    for (i in 0 until num) {
        while (true) {
            try {
                list.add(User(readln().toString(), readln().toInt()))
                break
            } catch (e: NumberFormatException) {
                println("Couldn't parse a number. Please, try again")
            }
        }
    }

    val resSequence = list.asSequence()
        .filter { it.getAge() >= 18 }
        .map { it.getName() }

    val elements = resSequence.toList()

    for (j in elements.indices) {
        print(elements[j])
        if (j + 1 == elements.size)
            println(' ')
        else
            print(", ")
    }
}