package classes.enumerations.nested.classes.interfaces

fun main(args: Array<String>) {
    //задание 1
    val man = Human("Дмитрий", 180, "мужчина")
    val head = Human.Head("русые", "серые", 58)
    val neak = Human.Neck(38.5f)
    val torso = Human.Torso(115, 90, 90)

    val hands = Human.Hands(12.5f, 25.0f,18.5f, 70)
    val legs = Human.Legs(44, 40.5f, 29.0f, 100.0f)

    println(man.toString())
    println(head.toString())
    println(neak.toString())
    println(torso.toString())
    println(hands.toString())
    println(legs.toString())
    println()
    println()

    //задание 2
    val surnames: Array<String> = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов");
    var input: String
    var count: Int
    println(surnames.contentDeepToString())
    println("Введите символы для поиска: \n1.Да\n2.Нет")
    if(readln() == "1") {
        while (true) {
            println("Введите символы для поиска:")
            var count = 0
            input = readln()
            for(surname in surnames) {
                if (surname.contains(input, true)) {
                    println("Найдено совпадение: "+ surname)
                    count++
                }
            }
            if (count ==0) {
                println("Совпадений не найдено")
            }
            println("Продолжить:\n1.Да\n2. Нет")
            if (readln() == "2") break
        }
    }

    //задание 3
    var intArr = arrayOf(1, 2, 3, 0, 5, 6, 0, 1, 5, 0)
    println(intArr.contentDeepToString())
    var posOneZero: Int = 0
    var posTwoZero: Int = 0
    for(index in intArr.indices) {
        if (intArr[index] == 0) {
            posOneZero = index
            break
        }
    }
    println("posOneZero = $posOneZero")
    var index: Int = posOneZero+1
    while(index >= posOneZero && index < intArr.count()) {
        if (intArr[index] == 0) {
            posTwoZero = index
            break
        }
        index++
    }
    println("posTwoZero = $posTwoZero")
    if (posOneZero > 0 && posTwoZero > 0) {
        val res = posTwoZero-posOneZero-1
        println("Между нулевыми элементами расположено: $res элемент(а/ов)")
    } else {
        println("Массив инициализирован некорректно, в нем нет двух нулевых элементов")
    }
}