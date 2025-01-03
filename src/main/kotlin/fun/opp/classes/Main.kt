package `fun`.opp.classes

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    //Задание 1, создаем объект класса "Вертолет"
    val helicopter = Helicopter()
    helicopter.name = "Alligator"
    helicopter.weight = 10800
    helicopter.height = 6
    helicopter.speed = 310
    helicopter.info()
    println("-------------------")
    //Задание 2, создаем объект класса "Домашнее животное"
    val cat = Pet("Барсик", PetType.КОШКИ, 4.5f)
    cat.displayInfo()
    println("-------------------")
    //Задание 3, преобразование числа к целочисленному типу
    floatToInt(5.87f)
}


fun floatToInt(a : Float) {
    println("Число с плавающей точкой $a приводим к целому типу, получаем: "+ a.roundToInt())
}