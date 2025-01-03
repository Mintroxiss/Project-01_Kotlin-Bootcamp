package org.example

class User(name:String, age:Int) {

    private var name:String
    private var age:Int

    init {
        if (age > 0) {
            this.age = age
        } else {
            this.age = 0
            println("Incorrect input. Age <= 0")
        }

        this.name = name
    }

    fun getName(): String {
        return this.name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getAge(): Int {
        return age
    }

    fun setAge(age: Int) {
        if (age > 0) {
            this.age = age
        } else {
            this.age = 0
            println("Incorrect input. Age <= 0")
        }
    }



}