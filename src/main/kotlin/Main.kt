fun main(args: Array<String>) {
    var digit: Int = 7

    if ( digit > 0)
         digit++

    println("digit: $digit")

    var a: Int = 4
    var b: Int = 45
    var c: Int = -2
    var d: Int = 8

    var countPlus: Int = if (a > 0) 1 else 0
    if (b > 0) countPlus++
    if (c > 0) countPlus++
    if (d > 0) countPlus++

    println("Кол-во положительных: $countPlus")

    println("Большее: " + if (a>b)a else b)

    printDayOfWeek(4);
    printGrade(5);
    calcAction(3,2.0,3.0)
}

fun calcAction(act: Int, x: Double, y: Double) {
    var result: Double = 0.0

    if (act < 1 || act > 4) {
        println("Ошибка: действие не определено");
    } else {
        if (act == 1) {
            result = x + y
        } else if ( act == 2) {
            result = x - y
        } else if ( act == 3) {
            result = x * y
        } else {
            if (y == 0.0) {
                println("Ошибка: на ноль делить нельзя");
            } else {
                result = x / y
            }
        }
        println("Результат вычисления: $result")
    }
}


fun printDayOfWeek(a: Int) {
    if ( a >= 1 && a <= 7) {
        if (a == 1) println("пн")
        else if (a == 2) println("вт")
        else if (a == 3) println("ср")
        else if (a == 4) println("чт")
        else if (a == 5) println("пт")
        else if (a == 6) println("сб")
        else println("вс")
    }
}

fun printGrade(K: Int) {
    var result: String
    if ( K >= 1 && K <= 5) {
        if (K == 1) result = "плохо"
        else if (K == 2) result = "неудовлетворительно"
        else if (K == 3) result = "удовлетворительно"
        else if (K == 4) result = "хорошо"
        else result = "отлично"
        println(result)
    } else {
        println("Ошибка, оценка может быть только от 1 до 5")
    }
}
