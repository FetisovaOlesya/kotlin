package lambda

fun main(args: Array<String>) {
   //задание 1
    lambdaPrint(5)
    println()

    //задание 2
    var list: List<Int> = listOf<Int>(2, 4, 5, 1)
    val arithMean: (List<Int>) -> Int = { list: List<Int> -> list.sum()/list.size}
    println( arithMean(list))
    println()

    //задание 3
    val arr = intArrayOf(1, -1, 3, -2, 6, -8, -4, 2)
    println(arr.filter { it > 0 })
    println()

    //задание 4
    val arrTwo = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val expression = arrTwo.map { if (it % 2 == 0) it / 2 else it * 3 }

    println(expression)
}




fun lambdaPrint(n: Int) {
    val print = {i: Int, n: Int -> println("$i раз из $n")}
    var i = 1;
    while (i <= n) {
        print(i++, n);
    }
}