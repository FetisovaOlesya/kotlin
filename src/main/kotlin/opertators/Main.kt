package opertators

fun main(args: Array<String>) {
    val age: Int = 40
    val name: String = "Олеся"
    val isStudent: Boolean = true
    val salary: Double = 160000.0
    var a = 5;
    var p = getPerimeterOfSquare(a);
    var s = getAreaOfSquare(a);


    println("Age: $age | Name: $name | Is Student: $isStudent | Salary: $salary")
}

fun getPerimeterOfSquare(a:Int): Int {
    return 4 * a
}

fun getAreaOfSquare(a:Int): Int {
    return a * a
}