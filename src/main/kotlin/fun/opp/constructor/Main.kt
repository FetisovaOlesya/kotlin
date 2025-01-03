package `fun`.opp.constructor

fun main(args: Array<String>) {
    val box = Box(15, 5, 10)
    println("Объем коробки = " + box.calculateVolume() + " см \n")

    println("-- задание 2 --")
    val arr = arrayOf(3, 67, 1, 55, 65, 89, 23)
    findMinAndMax(arr)
    println("-- задание 3 --")
    println(arr.contentDeepToString())
    println("-- задание 4 --")
    descriptionNumber(-34)
    descriptionNumber(-11)
    descriptionNumber(0)
    descriptionNumber(34)
    descriptionNumber(35)
    println("-- задание 5 --")
    var car = Car(1500, 30)
    car.info()
    car.stop()
    car.info()
    car.drive(75)
    car.info()
}

fun findMinAndMax(arr: Array<Int>) {
    var min: Int = arr[0]
    var max: Int = arr[0]
    var i: Int = 0
    do {
        if (min > arr[i]) min = arr[i]
        if (max < arr[i]) max = arr[i]
        i++
    }
    while(i < arr.size)
    println("Min = $min | max = $max")
}

fun descriptionNumber(value: Int) {
    when {
        value < 0 && value % 2 == 0 -> println("$value - Отрицательное четное число")
        value < 0 && Math.abs(value % 2) == 1 -> println("$value - Отрицательное нечетное число")
        value == 0                  -> println("$value - Нулевое число")
        value > 0 && value % 2 == 0 -> println("$value - Положительное четное число")
        value > 0 && value % 2 == 1 -> println("$value - Положительное нечетное число")
    }
}