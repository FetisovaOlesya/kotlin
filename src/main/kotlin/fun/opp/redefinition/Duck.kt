package `fun`.opp.redefinition

class Duck (name: String, type: String): Bird(name, type) {
    override var isSweem: Boolean = true

    override fun getAddInfo() {
        println("Перелетная водоплавающая птица")
    }
}

