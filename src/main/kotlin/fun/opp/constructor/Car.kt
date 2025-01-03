package `fun`.opp.constructor

class Car constructor(val weight: Int, var speed: Int) {
    fun drive(value: Int) {
        speed = value
    }
    fun stop() {
        speed = 0
    }

    fun info() {
        when {
            speed == 0 -> println("Автомобиль остановился")
            speed > 0 -> println("Автомобиль движется со скоростью $speed км/ч")
        }
    }
}