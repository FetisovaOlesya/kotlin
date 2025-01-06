package `fun`.opp.inheritance

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    val dog = Dog("Шарик", 12.0f)
    dog.eat()
    dog.walk()
    println()
    val cat = Cat("Барсик", 4.0f)
    cat.eat()
    cat.catchMouse()
    println("-------------------------------")

    var sony = Sony("klv-32bx300", 2015, "чёрный")
    sony.call("+79051234358")

    var nokia = Nokia("3310", 2000, "красный")
    nokia.call("+79051234388")

    println("-------------------------------")
    var arr = arrayOf(3, 67, 1, 55, 65, 89, 23)
    for (i in arr.indices) {
        if (arr[i] % 5 == 0) {
            print(arr[i])
            print(" ")
        }
    }

}