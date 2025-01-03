package `fun`.opp.incapsulate

fun main(args: Array<String>) {
    var card = BankCard()
    card.number = "1234 1234 5432 4534"
    println("Номер карты: " + card.number)
    card.getInfo()
    println()

    //задание 2
    var a = 15
    a += 7
    println("Результат +=: $a")
    a -= 4
    println("Результат -=: $a")
    a *= 2
    println("Результат *=: $a")
    a %= 3
    println("Результат %=: $a")
    println()

    //задание 3
    var b: Int = 75
    var c: Int
    c = b/10 + b%10*10
    println("$b -> $c")
}

