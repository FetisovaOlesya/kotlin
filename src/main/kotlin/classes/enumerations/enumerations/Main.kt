package classes.enumerations.enumerations

import classes.enumerations.data.classes.Ticket

fun main(args: Array<String>) {
    val seasons = Seasons()
    var index: Int
    while (true) {
            do {
                println("Введите месяц года (от 1 до 12):");
                index = readln().toInt()
            } while (index <1 || index > 12)

            seasons.getSeasonByMonth(index)

            println("Хотите повторить?: \n1.Да\n2. Нет")
            if (readln() == "2") break
    }

    //Задание 2
    val str = "Шумоизоляция"

    var mapChar: MutableMap<Char, Int> = mutableMapOf<Char, Int>()

    for (char in str) {
        mapChar[char] = mapChar.getOrDefault(char, 0) +1
    }
    println(mapChar.toString())
    var repeatChars = mapChar.filter { it.value > 1 }
    if (repeatChars.count() > 0) {
        println("Повторяющиеся символы:" + repeatChars.toString())
    } else {
        println("Нет повторяющихся символов")
    }
}