package `fun`.opp.inheritance

class Dog(name: String, weight: Float) : Animal(name, weight) {

    fun walk() {
        println("Собаку по кличке $name выгуливают")
    }

}