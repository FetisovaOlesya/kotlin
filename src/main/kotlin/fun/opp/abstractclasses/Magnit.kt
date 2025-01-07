package `fun`.opp.abstractclasses

class Magnit(title: String, address: String, phone: String) : Shop(title, address, phone) {
    override fun openInfo() {
        println("Магазин открыт с 8 до 23")
    }

    override fun delivery() {
        println("Доставка от двух часов и более")
    }

}