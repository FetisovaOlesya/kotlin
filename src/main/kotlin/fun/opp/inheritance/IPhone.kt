package `fun`.opp.inheritance

abstract class IPhone (val model: String, val year: Int, val color: String) {

    open var name: String = "IPhone"

    fun call(number: String) {
        println("IPhone $model $year года выпуска, цвет $color - начал вызов по номеру $number")
    }
}