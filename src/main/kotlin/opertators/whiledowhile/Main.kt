package opertators.whiledowhile

import java.util.Scanner

fun main(args: Array<String>) {
    println("------ задание 1 ----------")
    //задание 1
    task1()
    println("------ задание 2 ----------")
    //задание 2
    printPrice(185.99)
    println("------ задание 3 ----------")
    //задание 3
    printAandB()
    println("------ задание 4 (вариант 1)----------")
    //задание 4
    task4(29078345)
    println("------ задание 4 (вариант 2) ----------")
    task4(169)
    //задание 5
    println("------ задание 5 ----------")
    task5()
    println("------ задание 6 ----------")
    //задание 6
    calcPercent(350.0, 9)
}

fun task1() {
    var number: Int
    var result: Int = 1
    var n: Int = 2
    do {
        println ("Введите число > 0")
        number = readLine().toString().toInt()
    } while (number <=0 )
    println("Вы ввели: $number")
    while (n <= number) {
        result *= n++

    }
    println("Факториал $number: $result")
}

fun task5() {
    var min: Int = 1
    var max: Int = 20
    var i: Int = min
    while (i <= max) {
        when {
            i % 4 == 0 -> println("условие 2 (i=$i): " + i*2)
            i % 2 == 0 -> println("условие 1 (i=$i): $i")
            i  == 19 -> break
        }
       i++
    }
}

fun task4(digit: Int) {
    var tmpDigit: Int = digit
    while (tmpDigit > 0) {
        println(tmpDigit % 10)
        tmpDigit = tmpDigit / 10
    }
}

fun calcPercent(sum: Double, srok: Int) {
    val percent: Int = 7
    var count: Int = 0;
    var result: Double = sum
    while ( count++ < srok) {
        result += sum * 7 / 100 //я так поняла, что вклад без капитализации процентов
    }
    println("Сумма вклада будет равна: $result")

}

fun printPrice(price: Double) {
    var i: Int = 0
    var result: Double
    while ( ++i <= 10 ) {
        result = price * i
        println("Стоимость $i кг = $result руб")
    }

}

fun printAandB() {
    var A: Int = 2
    var B: Int = 7
    var i: Int = A
    var count: Int = 0
    while (i <= B) {
        print("$i ")
        i++
        count++
    }
    println()
    println("Количество $count")

}