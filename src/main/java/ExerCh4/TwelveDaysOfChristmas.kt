package ExerCh4

class TwelveDaysOfChristmas {
    private val PARTRIDGE : String = "PARTRIDGE"
    private val TURTLEDOVES : String = "TURTLE DOVES"
    private val FRENCHHENS : String = "FRENCH HENS"
    private val CALLINGBIRDS : String = "CALLING BIRDS"
    private val GOLDRINGS : String = "GOLD RINGS"
    private val GEESE : String = "GEESE"
    private val SWANS : String = "SWANS"
    private val MAIDS : String = "MAIDS"
    private val LADIES : String = "LADIES"
    private val LORDS : String = "LORDS"
    private val PIPERS : String = "PIPERS"
    private val DRUMMERS : String = "DRUMMERS"

    fun getItem(given: Int): String {
        return when (given){
            1 -> PARTRIDGE
            2 -> TURTLEDOVES
            3 -> FRENCHHENS
            4 -> CALLINGBIRDS
            5 -> GOLDRINGS
            6 -> GEESE
            7 -> SWANS
            8 -> MAIDS
            9 -> LADIES
            10 -> LORDS
            11 -> PIPERS
            12 -> DRUMMERS
            else -> ""
        }
    }
}