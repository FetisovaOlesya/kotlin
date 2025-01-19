package classes.enumerations.delegation

fun main(args: Array<String>) {

    println("Введите десятичное число:")
    val decimalInput = readLine()?.toIntOrNull()
    if (decimalInput != null) {
        val binaryOutput = decimalToBinary(decimalInput)
        println("Десятичное число $decimalInput в двоичной системе: $binaryOutput")
    } else {
        println("Вы ввели некорректное значение")
    }

    println("Введите двоичное число:")
    val binaryInput = readLine()
    if (binaryInput != null && binaryInput.all { it == '0' || it == '1' }) {
        val decimalOutput = binaryToDecimal(binaryInput)
        println("Двоичное число $binaryInput в десятичной системе: $decimalOutput")
    } else {
        println("Вы ввели некорректное значение")
    }

    println()
    taskCheckPolindrom()

}

fun taskCheckPolindrom() {
    val word: String = "Казак"
    val str = word.lowercase()
    var len: Int = str.length
    var i: Int = 0
    while ( i < len/2) {
        if (str[i] != str[len - i -1]) {
            println("Слово $word не является полиндромом")
            return
        }
        i++
    }
    println("Слово $word - полиндром")
}

fun decimalToBinary(decimal: Int): String {
    if (decimal == 0) return "0"

    var num = decimal
    val binaryString = StringBuilder()

    while (num > 0) {
        binaryString.insert(0, num % 2)
        num /= 2
    }

    return binaryString.toString()
}

fun binaryToDecimal(binary: String): Int {
    return binary.fold(0) { acc, char ->
        acc * 2 + (char - '0')
    }
}