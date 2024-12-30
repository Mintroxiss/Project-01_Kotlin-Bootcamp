package org.example

class TimeFormat {
    private var time = 0
    private var fl = false

    private var hours = 0
    private var minutes = 0
    private var seconds = 0

    // Устанавливает время
    fun setTime(time: Int) {
        this.time = time
        fl = false
    }

    // Делит время на часы, минуты и секунды
    fun separateTime() {
        if (time >= 0) {
            var cutTime = time / 3600

            hours = cutTime
            cutTime = time - cutTime * 3600

            minutes = cutTime / 60

            seconds = cutTime % 60
            fl = true
        }
    }

    fun printTime() {
        if (fl) {
            println("${String.format("%02d", hours)}:${String.format("%02d", minutes)}:${String.format("%02d", seconds)}")
        } else {
            println("Incorrect time")
        }

    }

}