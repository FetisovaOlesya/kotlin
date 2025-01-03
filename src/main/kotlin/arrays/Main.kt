package arrays

fun main(args: Array<String>) {
    println("------ задание 1 ----------")
    //задание 1
    task1()
    println("------ задание 2 ----------")
    //задание 2
    task2()
    println("------ задание 3 ----------")
    //задание 3
    task3()
    println("------ задание 4 ----------")
    //задание 4
    task4()
}

fun task4() {
    val n: Int = 5
    var number = arrayOfNulls<Int>(n)
    var i: Int
    var value: Int = 2

    for(index in number.indices){
        value = 2
        for (i in 2 .. index+1) {
            value *= 2
        }
        number[index] = value
    }
    println(number.contentToString())

}

fun task3() {
    val size: Int = 10
    val numbers = arrayOf<Int>(1, 1, 2, 6, 9, 5, 2, 1, 12, 9)
    var i: Int
    var count: Int = 0;
    for (i in 1..numbers.size) {
        if (numbers[i-1] % 2 == 0) {
            print(numbers[i-1])
            print(" ")
            count++
        }
    }
    println()
    println("Вcего четных элементов: $count")
}


fun task1() {
    val numbers = arrayOf<Double>(1.2, 1.6, 2.43, 6.6, 9.3, 5.2, 2.1, 1.2, 12.0, 9.3)
    var result: Double = 1.0
    val count: Int = numbers.size - 1

    for (i in 0 .. count) {
        result *= numbers[i]
        println ("$result")
    }
    println ("Произведение чисел: $result")
}

fun task2() {
    val numbers = arrayOf<Int>(1, 2, 3, 4, 5, 6, 7, 8)
    var i: Int
    var sum: Int = 0
    var result: Float

    for (i in 1 .. numbers.size) {
        sum += numbers[i-1]
    }
    println("Среднее арифметическое " + sum.toFloat() / numbers.size)
}