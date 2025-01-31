package lambda.generic

fun main(args: Array<String>) {
    //задание 1
    print("Иван Иванович")
    print(1287)
    print(18.9f)
    print(true)
    print("")

    //задание 2
    val person = Person("Петр Сидорович", 79013843845)
    val personTwo = Person("Алберт Энштейнович", "+79013843845")
    print("${person.name}: ${person.phone}")
    print("${personTwo.name}: ${personTwo.phone}")
    print("")

    //задание 3
    display(10, '{')
    display("Hello", '[')
    display(listOf(10,16,3),'-')
    display('f', '(')
}

fun <T> display(value: T, type: Char) {
    when(type) {
        '{' -> println("{$value}")
        '[' -> println("[$value]")
        '(' -> println("($value)")
        '\'' -> println("'$value'")
        else -> println("$value")
    }
}


fun <T> print(value: T) {
    println(value)
}

class Person <T> (val name: String, val phone: T)






