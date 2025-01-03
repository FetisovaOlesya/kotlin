package opertators.operatorfor

import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("------ задание 1 ----------")
    //задание 1
    calcArithmeticMean()
    println("------ задание 2 ----------")
    //задание 2
    calcCirle()
    println()
    println("------ задание 3 ----------")
    //задание 3
    task3()
    println("------ задание 4 ----------")
    //задание 4
    printSubsequence()
    println()
    //задание 5
    println("------ задание 5 ----------")
    printOdd()
}

fun task3() {
    val x1: Int = 3
    val y1: Int = 2
    val x2: Int = 6
    val y2: Int = 4
    var P: Int
    var S: Int
    P = ((x2-x1) + (y2-y1))*2
    S = (x2-x1)*(y2-y1)
    println("Периметр: $P, Площадь: $S")
}

fun printOdd() {
    var n: Int = 20
    var i: Int
    for (i in n downTo 0 ) {
        if (i % 2 == 0) {
            print("$i ")
        }
    }
}

fun printSubsequence() {
    var i: Int = 1
    var res: Int = 1
    print("$res ")

    for (i in 1 .. 9 ) {
        res = res*2
        print(res)
        print(" ")
    }
}

fun calcArithmeticMean() {
    var A: Double = 4.0
    var B: Double = 19.0
    var result: Double

    result  = ((A + B) / 2)

    println("Среднее арифметическое чисел: $result")
}

fun calcCirle() {
    var S: Double = 19.625
    var D: Double
    var L: Double
    val pi: Double = 3.14

    D = sqrt(4 * S /pi)
    L = pi * D

    print ("D = $D | L = $L")
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

