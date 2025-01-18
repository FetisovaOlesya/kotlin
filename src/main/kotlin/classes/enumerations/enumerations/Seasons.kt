package classes.enumerations.enumerations

class Seasons {
    var winter = Season("Зима", arrayOf(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY))
    var spring = Season("Весна", arrayOf(Month.MATCH, Month.APRIL, Month.MAY))
    var summer = Season("Лето", arrayOf(Month.JUNE, Month.JULE, Month.AUGUST))
    var autumn = Season("Осень", arrayOf(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER))

    private val seasons = arrayOf(winter, spring, summer, autumn)

    public fun getSeasons(): Array<Season> {
        return seasons
    }

    public fun getSeasonByMonth(index: Int) {
        for (season in seasons.iterator()) {
            for(month in season.getMonths().iterator()) {
                if (month.num == index) {
                    println("Сезон: " + season.name)
                }
            }
        }
    }
}