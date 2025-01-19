package classes.enumerations.higher.order.functions

fun main(args: Array<String>) {
    println("------ задание 1 ----------")
    //задание 1
    println("Получился " + action("серо", "голобой", ::operation) + " цвет")


    println("------ задание 2 ----------")
    //задание 2
    val array = intArrayOf(1, 2, 3, 4, 5)
    println("Исходный массив ${array.joinToString(", ")}")

    println("Массив после применения функции addOne  " + task2(array, ::addOne).joinToString(", "))
    println("Массив после применения функции multTwo  " + task2(array, ::multTwo).joinToString(", "))

}

fun action(colorOne: String, colorTwo: String, op:(String, String) -> String ): String {
    return op(colorOne, colorTwo)
}

fun operation(colorOne: String, colorTwo: String) : String {
    return colorOne.plus(" - ").plus(colorTwo)
}


fun task2(array: IntArray, op:(Int)->Int): IntArray {
    return array.map{ op(it) }.toIntArray()
}

fun addOne(a: Int) = a + 1
fun multTwo(a: Int) = a * 2


