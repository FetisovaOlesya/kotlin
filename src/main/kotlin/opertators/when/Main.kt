package opertators.`when`

fun main(args: Array<String>) {
    printMonth(4)
    printMonth(12)
    printMonth(15)
    println()

    roundFunc(5.3f)
    roundFunc(69.1f)
    roundFunc(27.5f)
    println()

    determineTimeOfDay(3)
    determineTimeOfDay(12)
    determineTimeOfDay(19)
    determineTimeOfDay(23)
    println()

    var a: Int = 8
    var b: Int = 5
    var tmp: Int
    when {
        a != b -> {
            tmp = a
            a = b
            b = tmp
        }
    }
    println("a = $a, b = $b")
}

fun determineTimeOfDay(hour: Int) {
    when(hour) {
        in 0 .. 5 -> println("Раннее утро")
        in 6 .. 11 -> println("Утро")
        in 12 .. 17  -> println("День")
        in 18 .. 20 -> println("Вечер")
        in 21 .. 23 -> println("Поздний вечер")
        else -> println("Неверное значение")
    }

}

fun roundFunc(value: Float) {
    var whole: Float = value
    var remainder: Float = value * 10 % 10

    println ("value = $value")
    println ("whole = $whole")
    println ("remainder = $remainder")
    whole -= remainder /10

    println ("whole = $whole")

    print("$value округлили до ближайшего целого, результат: ")
    when {
        remainder >=5 -> println(++whole)
        else          -> println(whole)
    }
}

fun printMonth(numMonth: Int) {
    when(numMonth) {
        1,  2,  12 ->  {
                            print("Зима: ")
                            when(numMonth) {
                                1 -> println("Январь.")
                                2 -> println("Февраль.")
                                12 -> println("Декабрь.")
                            }
                        }
        3,  4,  5 ->   {
                            print("Весна: ")
                            when(numMonth) {
                                3 -> println("Март.")
                                4 -> println("Апрель.")
                                5 -> println("Май.")
                            }
                        }
        6,  7,  8 ->  {
                            print("Лето: ")
                            when(numMonth) {
                                6 -> println("Июнь.")
                                7 -> println("Июль.")
                                8 -> println("Май.")
                            }
                        }
        9,  10,  11 ->   {
                            print("Осень: ")
                            when(numMonth) {
                                8 -> println("Сентябрь.")
                                10 -> println("Октябрь.")
                                11 -> println("Ноябрь.")
                            }
                        }
        else -> println("Введено неверное значение")
    }


}