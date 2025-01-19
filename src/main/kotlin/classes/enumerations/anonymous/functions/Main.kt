package classes.enumerations.anonymous.functions

fun main(args: Array<String>) {
    //--------- задание 1 ----------------
    println("----- задание 1 ---------")
    val greeting = fun(name: String, num: Int) = "Поздравляю тебя, $name с новым $num годом!"

    println(greeting("Иван", 2025))

    //--------- задание 2 ----------------
    println("----- задание 2 ---------")
    task2()

    println("----- задание 3 ---------")
    //--------- задание 3 ----------------
    var strOne = "мото"
    var strTwo = "цикл"
    println(task3(strOne, strTwo, fun(a: String, b: String) = a + b))
}

fun task2() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    checkArrayElement(array, fun (num: Int) = num % 2 == 0)
}

fun checkArrayElement(array: IntArray, isEven: (Int) -> Boolean) {
    println( array.filter{isEven(it)}.joinToString(", "))

}

fun task3(a: String, b: String, op: (String, String) -> String) = op(a, b)
