package complex.task

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
//    задание 5
    println("------ задание 5 ----------")
    task5()
}

fun task5() {
    val count: Int  = 3
    var i: Int = 0
    var answer: String
    println("Отгадайте загадку")
    println("Что это такое: синий, большой, с усами и полностью набит зайцами?")
    do {
        i++
        answer = readLine().toString()
        when(answer) {
            "Троллейбус","троллейбус" -> {
                                println("Правильно!")
                                break
                            }
            "Сдаюсь","сдаюсь" -> {
                                println("Правильный ответ: троллейбус")
                                break
                            }
           else ->  if (i < 3) println("Пробуй еще") else println("Вы потратили все попытки")
        }
    } while (i < count)
}

fun task4() {
    val n: Int = 13
    var i: Int = 1

    for (i in 2 .. n-1 ) {
        if (n % i == 0) {
            println ("Число $n не является простым")
            return
        }
    }
    println ("Число $n является простым")
}

fun task3() {
    val a: Int = 2
    val b: Int = 5
    var i: Int
    var j: Int
    var n: Int = 1

    for (i in a .. b ) {
        for (j in 1 .. n) {
            print(i)
        }
        n++
    }
    println()
}

fun task1() {
    val n: Int = 3
    var i: Int
    var result: Float = 1.0f
    if (n > 0) {
        for (i in 2..n) {
            println ("1/$i = " + 1.0f/i)
            result += 1.0f/i
        }
        println("Результат: " +  String.format("%.2f", result))
    } else {
        println("n должно быть больше 0")
    }
}

fun task2() {
    val a: Int = 2
    val b: Int = 5
    var i: Int
    var result: Int = 0

    for (i in a..b) {
        result += i*i
    }
    println("Сумма всех квадратов = $result")
}