package matrix

fun main(args: Array<String>) {
    println("------ задание 1 ----------")
    //задание 1
    task1()
    println("------ задание 2 ----------")
//    задание 2
    task2()
    println("------ задание 3 ----------")
    //задание 3
    task3()
    println("------ задание 4 ----------")
    //задание 4
    task4()
}

fun task2() {
    val matrix = arrayOf(
        arrayOf(6, 9, 2, 3, 5),
        arrayOf(7, 8, 1, 4, 10),
        arrayOf(12, 13, 11, 15, 14)
    )
    var arr = Array(15){0}
    var tmp: Int
    var j: Int
    var k: Int = 0
    var result: Float
    for(i in matrix.indices) {
        for(j in matrix[i].indices) {
            arr[k++] = matrix[i][j]
        }
    }
    println(arr.contentDeepToString())
    for(i in arr.indices) {
        j = i+1
        while(j < arr.size ) {
            if (arr[i] > arr[j] ) {
                tmp = arr[i]
                arr[i] = arr[j]
                arr[j] = tmp
            }
            j++
        }
    }
    println(arr.contentDeepToString())
    if (arr.size % 2 == 1) {
        println("Среднее значение (медиана) [для нечетного кол-ва элементов]: " + arr[arr.size / 2])
    } else {
        k = arr.size/2
        result = (arr[k].toFloat() + arr[k+1].toFloat())/2
        println("Среднее значение (медиана) [для четного кол-ва элементов]: $result")
    }
}

fun task4() {
    val matrix = arrayOf(
        arrayOf(6, 4, 2),
        arrayOf(3, 5, 7),
        arrayOf(8, 1, 9)
    )
    var max: Int = matrix[0][0]
    var maxTwo: Int = 0
    for (i in matrix.indices) {
        for(j in matrix[i].indices) {
            if (max < matrix[i][j])
                max = matrix[i][j]
        }
    }

    for (i in matrix.indices) {
        for(j in matrix[i].indices) {
            if (maxTwo < matrix[i][j] && matrix[i][j] != max)
                maxTwo = matrix[i][j]
        }
    }
    println("Max = $max | maxTwo = $maxTwo")
}

fun task3() {
    var matrix: Array<Array<Int>> = Array(5)  {Array(5){0}}
    println(matrix.contentDeepToString())
    println("Заполняем значениями")
    matrix[2][2] = 1
    matrix[3][1] = 1
    matrix[3][2] = 1
    matrix[3][3] = 1
    for(i in matrix[4].indices) {
        matrix[4][i] = 1
    }
    println(matrix.contentDeepToString())
}


fun task1() {
    val matrix = arrayOf(
                    arrayOf(6, 9, 2),
                    arrayOf(3, 5, 7),
                    arrayOf(8, 1, 4)
    )
    var min: Int = matrix[0][0]
    for (i in matrix.indices) {
        for(j in matrix[i].indices) {
            if (min > matrix[i][j])
                min = matrix[i][j]
        }
    }
    println ("Минимальный элемент матрицы: $min")
}