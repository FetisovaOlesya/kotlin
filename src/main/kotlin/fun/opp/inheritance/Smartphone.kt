package `fun`.opp.inheritance

abstract class Smartphone (val model: String, val year: Int, val color: String) {

    open var name: String = "Smartphone"

    fun call(number: String) {
        println("$name $model $year года выпуска, цвет $color - начал вызов по номеру $number")
    }
}

