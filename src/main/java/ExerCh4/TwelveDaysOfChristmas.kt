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
        when (given){
            1 -> return PARTRIDGE
            2 -> return TURTLEDOVES
            3 -> return FRENCHHENS
            4 -> return CALLINGBIRDS
            5 -> return GOLDRINGS
            6 -> return GEESE
            7 -> return SWANS
            8 -> return MAIDS
            9 -> return LADIES
            10 -> return LORDS
            11 -> return PIPERS
            12 -> return DRUMMERS
        }
        return ""
    }
}