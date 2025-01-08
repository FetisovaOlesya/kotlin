package `fun`.opp.redefinition

fun main(args: Array<String>) {
    println("------ задание 1 ----------")
    val starling = Bird("Скворец", "Воробьинообразные")
    starling.printInfo()
    println("------")

    val martin = Bird("Ласточка", "Воробьинообразные")
    martin.printInfo()
    println("------")

    var durk = Duck("Утка", "Гусеобразные")
    durk.printInfo()
    println("------")

    var penguin = Penguin("Пингвин", "Пингвинообразные")
    penguin.printInfo()
    println()

    println("------ задание 2 ----------")
    val arrString = arrayOf("привет", "штиблет", "шпингалет", "буклет", "жилет", "макет", "паштет")
    var length: Int = 0
    var maxWord: String = ""
    for(i in arrString.indices) {
        if(arrString[i].length > length) {
            maxWord = arrString[i]
            length = arrString[i].length
        }
    }

    println(arrString.contentDeepToString())
    println("Самое длинное слово: $maxWord его длина $length символов")
    println()

    println("------ задание 3 ----------")
    var str = "ПриВет, кАк деЛа"
    val arrChars = str.toCharArray()
    var count = 0
    println("Дана строка: " + str)
    print("Символы в верхнем регистре: ")
    for(char in arrChars) {
        if  (char.code >= 'А'.code && char.code <= 'Я'.code) {
            print(char + " ")
            count++
        }
    }
    print(", всего $count шт")
    println()
}
