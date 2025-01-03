package `fun`.opp.constructor

//размеры коробки в см
class Box constructor(val width: Int, val height: Int, val depth: Int) {

    fun calculateVolume(): Int {
        return width * height * depth
    }
}