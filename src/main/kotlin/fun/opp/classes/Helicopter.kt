package `fun`.opp.classes

class Helicopter {
    var name: String = ""
    var weight: Int = 0
    var speed: Int = 0
    var height: Int = 0

    fun info() {
        println("Спроектирован вертолет с названием \"$name\" \n"+
                "скоростью полета $speed км/ч \n" +
                "весом $weight кг \n" +
                "высотой полета $height км"
        )
    }
}