package classes.enumerations.enumerations

class Season (val name: String, private val months: Array<Month>) {

    fun getMonths(): Array<Month> {
        return months
    }
}