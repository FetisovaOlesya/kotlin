package classes.enumerations.types.functions

fun main(args: Array<String>) {
    val number: Int = 3
    val operation: (Int)-> Int  =:: fuctorial

    println("Факториал $number = " + operation(number))
    println()
    println("---------------")

    val n = 3
    val result = powerOfTen(n)
    println("10 в степени $n равно $result")
    println()
    println("---------------")

    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    println("Исходный массив: ${array.joinToString(", ")}")
    incrementEverySecondElement(array)
    println("Массив после увеличения каждого второго элемента на единицу: ${array.joinToString(", ")}")
}

fun fuctorial(num: Int): Int {
    if (num > 0) {
        return num * fuctorial(num - 1)
    } else {
        return 1
    }
}

fun powerOfTen(n: Int): Int {
    if (n > 0) {
        return 10 * powerOfTen(n - 1) // 10^n = 10 * 10^(n-1)
    } else {
        return 1
    }
}

fun incrementEverySecondElement(array: IntArray) {
    for (i in array.indices step 2) {
        array[i] += 1 // Увеличиваем элемент на единицу
    }
}