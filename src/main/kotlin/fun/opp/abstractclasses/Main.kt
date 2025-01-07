package `fun`.opp.abstractclasses

fun main(args: Array<String>) {
    val pyaterochka = Pyaterochka("Пятерочка", "г. Ярославль, проспект Авиаторов 70", "60-23-25")
    pyaterochka.printInfo()
    pyaterochka.openInfo()
    pyaterochka.delivery()
    println("-------------------")

    val magnit = Magnit("Магнит", "г. Ярославль, ул. Машиностроителей 18", "60-88-22")
    magnit.printInfo()
    magnit.openInfo()
    magnit.delivery()
    println("-------------------")

    val student = Student("Горбунов", "Петр", 17)
    student.info()
    student.work()
    student.learn()
    println("-------------------")

    val studentTwo = Student("Колесов", "Александр", 20)
    studentTwo.info()
    studentTwo.work()
    studentTwo.learn()
    println("-------------------")

    val employee = Employee("Мартынов", "Сергей", 42)
    employee.info()
    employee.work()
    employee.learn()
    println("-------------------")

    println(len(1.5f, 1))
    println(len(1000f, 2))
    println(len(5.5f, 3))
    println(len(0.1f, 4))
    println(len(0.1f, 5))
    println(len(0.1f, 6))
}


fun len(value: Float, num: Int): Float {
    var result: Float = 0.0f
    when(num) {
        //дециметр
        1 -> result = value * 10
        //километр
        2 -> result = value/1000
        //метр
        3 -> result = value
        //миллиметр
        4 -> result = value * 1000
        //сантиметр
        5 -> result = value * 100
        else -> {
            println("Недопустимое значение num")
            return 0.0f
        }
    }
    return result
}

