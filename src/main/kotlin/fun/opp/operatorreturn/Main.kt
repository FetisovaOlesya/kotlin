package `fun`.opp.operatorreturn

fun main(args: Array<String>) {
    println("------ задание 1 ----------")
    //задание 1
    val arr = arrayOf<Int>(4, 2, 5, 3, 9, 8, 7, 10)
    println("Количество локальных минимумов: " + numberLocalMin(arr))
    println("------ задание 2 ----------")
    //задание 2
    val arrTwo = arrayOf<Int>(4, 2, -5, 3, 9, 8, -7, 10)
    println("Первичный массив:      " + arrTwo.contentDeepToString())
    println("Массив после проверки: " + checkArray(arrTwo).contentDeepToString())
    println("------ задание 3 ----------")
    //задание 3
    val matrix: Array<Array<Int>> = arrayOf(
                                        arrayOf(4, 6, 1, 3),
                                        arrayOf(4, 7, 9, 0),
                                        arrayOf(3, 8, 12, 2),
                                        arrayOf(9, 3, 1, 4),
                                        arrayOf(5, 11, 7, 6)
                                    )
    val k = 2
    println("Дана матрица: [")
    for (i in matrix.indices) {
        println(matrix[i].contentDeepToString())
    }
    println("]")
    println("Строка $k матрицы: " + getRow(matrix, k).contentDeepToString())

}

fun getRow(matrix: Array<Array<Int>>, k: Int): Array<out Int?> {
    if ( 1<=k && k <= matrix.size) {
    } else {
        println("Введено некорректное число k = $k.")
        return arrayOfNulls<Int>(matrix[0].size)
    }
    return matrix[k-1]
}

fun checkArray(array: Array<Int>): Array<Int> {
    var arrResult = Array<Int>(array.size){0};
    for((index, value) in array.withIndex()) {
        if (value < 0) {
            arrResult[index] = value+1
        } else {
            arrResult[index] = value
        }
    }
    return arrResult
}

fun numberLocalMin(array: Array<Int>): Int {
    var count = 0
    var i = 1
    while (i < array.size-1) {
        if ( array[i-1] > array[i] && array[i] < array[i+1]) {
            count++
        }
        i++
    }
    return count
}