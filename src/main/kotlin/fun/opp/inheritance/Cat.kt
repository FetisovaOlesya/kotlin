package `fun`.opp.inheritance

class Cat(name: String, weight: Float) : Animal(name, weight) {

    fun catchMouse() {
        println("Кот по кличке $name ловит мышь")
    }
}