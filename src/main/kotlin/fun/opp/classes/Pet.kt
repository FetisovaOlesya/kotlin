package `fun`.opp.classes

class Pet(val name: String, val type: PetType, val weight: Float) {
    fun displayInfo() {
        println("Домашнее животное: " + type + "\n" +
            "Кличка: " + name + "\n" +
            "Вес: " + weight + " кг"
        )
    }
}

enum class PetType {
    КОРОВИ,
    ГУСИ,
    СОБАКИ,
    КОШКИ,
    КРОЛИКИ,
    СВИНЬИ
}