package `fun`.opp.abstractclasses

abstract class Shop(private val title: String, private val address: String, private val phone: String) {

    abstract fun openInfo()

    abstract fun delivery()

    fun printInfo() {
        println("Магазин \"$title\", адрес $address, номер телефона $phone")
    }
}