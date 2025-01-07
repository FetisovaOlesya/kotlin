package `fun`.opp.abstractclasses

class Pyaterochka(title: String, address: String, phone: String) : Shop(title, address, phone) {
    override fun openInfo() {
        println("Магазин открыт с 8 до 22")
    }

    override fun delivery() {
        println("Доставка от 30 минут")
    }

}