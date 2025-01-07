package `fun`.opp.abstractclasses

abstract class Person(val surname: String, val name: String, val age: Int) {

    abstract fun work()
    abstract fun learn()

    fun info() {
        println("$surname $name, возраст $age лет")
    }
}