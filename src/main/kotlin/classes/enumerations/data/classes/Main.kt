package classes.enumerations.data.classes

fun main(args: Array<String>) {
    val size = 2
    val tickets: Array<Ticket?> = arrayOfNulls<Ticket?>(size)
    var movie: String = ""
    var row: Int = 0
    var place: Int = 0
    var time: String = ""
    var index = 0

    println("Купить билет: \n1.Да\n2.Нет")
    if(readln() == "1") {
        while (true) {
            println("Введите название фильма: \n" +
                    "1. Терминатор в 22:00 \n" +
                    "2. Один дома в 12:00 \n" +
                    "3. Последний из Магикан в 22:00\n")
            var count = 0
            when(readln()) {
                "1" -> {
                    movie = "Терминатор"
                    time = "22:00"
                }
                "2" -> {
                    movie = "Один дома"
                    time = "12:00"
                }
                "3" -> {
                    movie = "Последний из Магикан"
                    time = "22:00"
                }
                else -> {
                    println("Данного фильма не существует, повторите ввод")
                    continue
                }
            }
            do {
                println("Выберите ряд от 1 до 10")
                row = readln().toInt()
            } while (row <1 || row > 10)
            do {
                println("Выберите место от 1 до 20")
                place = readln().toInt()
            } while (place <1 || place >20)
            tickets.set(index++, Ticket(movie, row, place, time))

            if (index < size) {
                println("Купить еще билет:\n1.Да\n2. Нет")
                if (readln() == "2") break
            } else {
                break
            }

        }
    }

    println()
    println("Проданные билеты: ")
    for(ticket in tickets) {
        if (ticket == null) return
        println(ticket)
    }
}