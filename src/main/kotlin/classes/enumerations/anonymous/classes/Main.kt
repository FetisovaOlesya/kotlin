package classes.enumerations.anonymous.classes

fun main(args: Array<String>) {
    //задание 1
    task1()
    //задание 2
    task2()
    //задание 3
    task3()
}

fun task1(){
    val s = "МАМА";
    val arrString = arrayOf("Апрель", "Сентябрь", "Май", "Март")
    var max: String = ""
    for (str in arrString)
        if ( str.length > max.length ) max = str

    println("Самое длинное слово: $max, длинной: " + max.length + " символов")
}

fun task2(){
    val matrix = arrayOf(
                    arrayOf(6, 4, 2, 4),
                    arrayOf(3, 5, 2, 2),
                    arrayOf(8, 3, 9, 3),
                    arrayOf(1, 1, 0, 7)
                )

    var sum: Int = 0
    for (i in matrix.indices)
        sum += matrix[matrix.size-1-i][i]

    println ("Сумма подочной диагонали = " + sum)

}

fun task3(){
    var samsung = object: Printer("Самсунг", "M1028") {
        override fun start() {
            println("Принтер $brand $model начал печатать")
        }

        override fun stop() {
            println("Принтер $brand. $model закончил печатать")
        }

    }
    samsung.printInfo()
    samsung.start()
    samsung.stop()

    var canon = object: Printer("Canon", "CRM-1867") {
        override fun start() {
            println("Принтер $brand $model приступил к печати")
        }

        override fun stop() {
            println("Принтер $brand. $model завершил печать")
        }

    }
    canon.printInfo()
    canon.start()
    canon.stop()
}


abstract class Printer(val brand: String, val model: String ) {
    fun printInfo() {
        println("Принтер " + brand + " модель " + model)
    }

    abstract fun start()

    abstract fun stop()
}