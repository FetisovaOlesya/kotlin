package `fun`.opp.vararg

fun main(args: Array<String>) {
    println("------ задание 1 ----------")
    //задание 1
    raisingToPower(2,4)
    println("------ задание 2 ----------")
    //задание 2
    productOfNumbers(2,6)
    println("------ задание 3 ----------")
    //задание 3
    println("НОД = " + greatestCommonDivisor(4, 16))
}

fun greatestCommonDivisor(a: Int, b: Int): Int {
    var num1 = a
    var num2 = b

    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }

    return num1
}

fun raisingToPower(a: Int, n: Int) {
    var result: Int = a
    for (i in 1..n) {
        result *= a
    }
    println ("Число $a в степени $n = $result")
}

fun productOfNumbers(a: Int, b: Int) {
    var result: Int = a
    if (a < b) {
        for (i in a+1 .. b) {
            result *= i
        }
        println("Произведение чисел от $a до $b = $result")
    } else {
        println("Значение a[$a] > b[$b]")
    }
}


