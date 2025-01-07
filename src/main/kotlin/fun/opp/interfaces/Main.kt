package `fun`.opp.interfaces

fun main(args: Array<String>) {
    val police = Police("Полиция", "02")
    police.getDescription()
    println("-------------------------")
    val medicine = Medicine("Скорая помощь", "03")
    medicine.getDescription()
    println("-------------------------")

    val a = 48
    val b = 18

    val result = gcd(a, b)
    println("Наибольший общий делитель $a и $b равен $result")
    println("-------------------------")

    val numbers = intArrayOf(3, 5, 2, 5, 1, 6, 6)
    val res = secondMaximum(numbers)

    if (res != null) {
        println("Второе максимальное число: $res")
    } else {
        println("Второго максимального числа нет.")
    }

}

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) {
        a
    } else {
        gcd(b, a % b)
    }
}

fun secondMaximum(numbers: IntArray): Int? {
    if (numbers.size < 2) {
        return null
    }

    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for (number in numbers) {
        if (number > max) {
            secondMax = max
            max = number
        } else if (number > secondMax && number < max) {
            secondMax = number
        }
    }

    return if (secondMax == Int.MIN_VALUE) null else secondMax
}
