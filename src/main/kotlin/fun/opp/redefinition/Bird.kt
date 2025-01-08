package `fun`.opp.redefinition

open class Bird {
    var name: String = ""
    var type: String = ""

    open var isFly: Boolean = true
    open var isSweem: Boolean = false
    open var isMigratory: Boolean = true

    constructor(name: String, type: String) {
        this.name = name
        this.type = type
    }

    open fun printInfo() {
        println("Птица: " + name)
        println("Отряд: " + type)

        getAddInfo()
    }

    open fun getAddInfo() {
        println("Перелетная птица, не водоплавающая")
    }
}