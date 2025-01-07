package `fun`.opp.interfaces

class Police(name: String, phone: String) : EmergencyResponseServices(name, phone) {
    override fun getDescription() {
        println("Полиция: охрана правопорядка и борьба с преступностью ")
        println("$name, телефон $phone")
    }
}