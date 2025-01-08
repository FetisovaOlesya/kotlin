package `fun`.opp.redefinition

class Penguin(name: String, type: String): Bird(name, type) {
    override var isSweem: Boolean = true
    override var isFly: Boolean = false

    override fun getAddInfo() {
        println("Водоплавающая птица, не летает")
    }
}

