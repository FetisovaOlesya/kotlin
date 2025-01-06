package `fun`.opp.inheritance

abstract class Animal (val name: String, val weight: Float) {

    fun eat() {
        println("Животное $name весом $weight кг принимает пищу")
    }
}