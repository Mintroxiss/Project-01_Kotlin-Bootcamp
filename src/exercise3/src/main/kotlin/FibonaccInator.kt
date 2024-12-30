package org.example

class FibonaccInator {
    private var numOfFibonacci: UInt = 0u

    fun setNumOfFibonacci(numOfFibonacci: UInt) {
        this.numOfFibonacci = numOfFibonacci
    }

    fun startCountFibonacci(): ULong? {
        try {
            val res: ULong = if (numOfFibonacci == 1u) {
                0u
            } else if (numOfFibonacci == 2u) {
                1u
            } else {
                countFibonacci(2u, 0u, 1u)
            }

            return res
        } catch (e: StackOverflowError) {
            println("Too large n")
        }

        return null
    }

    private fun countFibonacci(i: UInt, num1: ULong, num2: ULong): ULong {
        val res: ULong = if (i < numOfFibonacci) {
            countFibonacci(i + 1u, num2, num1 + num2)
        } else {
            num1 + num2
        }

        return res
    }
}