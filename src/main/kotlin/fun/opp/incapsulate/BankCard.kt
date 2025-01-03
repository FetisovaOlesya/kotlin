package `fun`.opp.incapsulate

class BankCard {
    var number: String = ""
        set(value) {
            field = value
        }
        get() = field

    private var code: String = ""
        set(value) {
            field = value
        }

    fun getInfo() {
        println("Данные карты будут доступны после ввода пароля")
    }

}
