package `fun`.opp.interfaces

class Medicine(name: String, phone: String) : EmergencyResponseServices(name, phone) {
    override fun getDescription() {
        println("Медицинские учреждения: охрана жизни и здоровья граждан")
        println("$name, телефон $phone")
    }
}