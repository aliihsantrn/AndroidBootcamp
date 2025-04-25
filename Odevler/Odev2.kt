package com.example.androidbootcamp.odev

fun main() {

    val funs = Functions()

    println(funs.convertFahrenhiet(100.0))
    funs.calculateArea(20,50)
    println(funs.calculateFactoriel(5))
    funs.calculateCharacter("Ali İhsan Turan")
    println(funs.calculateAngle(5))
    println(funs.calculateSalary(21))
    println(funs.calculateLimit(52))
}

class Functions {

    fun convertFahrenhiet(degree: Double) : Double {
        return (degree - 32) / 1.8
    }

    fun calculateArea(width: Int, height: Int) {
        println(width*2 + height*2)
    }

    fun calculateFactoriel(num: Int) : Int {
        if (num == 0) {
            return 1
        }
        var result = 1
        for (i in 1..num) {
            result *= i
        }
        return result
    }

    fun calculateCharacter(word: String) {
        var counter = 0
        for(i in word) {
            if (i == 'a' || i == 'A') {
                counter++
            }
        }
        println(counter)
    }

    fun calculateAngle(edgeNum: Int) : Int {
        return (edgeNum - 2) * 180
    }

    fun calculateSalary(dayNum: Int) : Double {
        val totalHour = dayNum * 8
        return if (totalHour <= 160) {
            totalHour * 10.0
        } else {
            val extraHour = totalHour - 160
            (160 * 10.0) + (extraHour * 20)
        }
    }

    fun calculateLimit(usage: Int) : Int {
        if (usage <= 50) {
            return usage*2
        }

        return 100 + ((usage - 50) * 4)

    }


}