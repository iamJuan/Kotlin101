package someexercises.exerch4

class TwelveDaysOfChristmas {
    fun getItem(given: Int) : Christmas12Days{
        return when (given){
            1 -> Christmas12Days.PARTRIDGE
            2 -> Christmas12Days.TURTLEDOVES
            3 -> Christmas12Days.FRENCHHENS
            4 -> Christmas12Days.CALLINGBIRDS
            5 -> Christmas12Days.GOLDRINGS
            6 -> Christmas12Days.GEESE
            7 -> Christmas12Days.SWANS
            8 -> Christmas12Days.MAIDS
            9 -> Christmas12Days.LADIES
            10 -> Christmas12Days.LORDS
            11 -> Christmas12Days.PIPERS
            12 -> Christmas12Days.DRUMMERS
            else -> null
        } as Christmas12Days
    }
}