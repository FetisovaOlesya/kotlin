package `fun`.opp.access.modifiers

import kotlin.math.roundToInt

fun main(args: Array<String>) {
    //Задание 1
    val regOne = Registration()
    regOne.setEmail("otimon@gmail.com")
    regOne.setPassword("12345")
    regOne.setPassword("123456")
    regOne.displayInto()
    println("-------------------")
    //Задание 2
    val matrix = arrayOf(
        arrayOf(1, 2, 3, 4),
        arrayOf(5, 6, 7, 8),
        arrayOf(9, 10, 11, 12),
        arrayOf(13, 14, 15, 16),
    )
    searchEvenNumbers(matrix)

    println("\n\n----Инициализация массива----------")
    //Задание 3
    var matrixTwo: Array<Array<Int>> = Array(4){Array(4){0}}
    println(matrixTwo.contentDeepToString())
    matrixTwo = initMatrix(matrixTwo)
    println(matrixTwo.contentDeepToString())

    //Задание 4
    println("\n\n----Положительные элементы массива----------")
    val matrixThree = arrayOf(
        arrayOf(1, -2, -3, 4),
        arrayOf(-5, 6, -7, -8),
        arrayOf(9, 10, 11, -12),
        arrayOf(13, -14, 15, 16),
    )
    println(matrixThree.contentDeepToString())
    findPositiveElements(matrixThree)
}

fun findPositiveElements(matrix: Array<Array<Int>>) {
    fun isPositive(value: Int): Boolean = value > 0

    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (isPositive(matrix[i][j])) print(" " + matrix[i][j])
        }
    }
}

fun initMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    var k = 1
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
           matrix[i][j] = k++
        }
    }
    return matrix
}

fun searchEvenNumbers(matrix: Array<Array<Int>>) {
    println("Двумерный массив")
    println(matrix.contentDeepToString())
    print("Четные значения массива:")
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            if (matrix[i][j] % 2 == 0) {
                print(" " + matrix[i][j])
            }
        }
    }
}