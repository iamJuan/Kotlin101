package ExerCh4

class IntegersWithSpace(){
    val SPACES : String = "  "

    fun getIntWithSpaces(number : Int) : String {
        var result = ""
        var divider : IntArray = intArrayOf(10000, 1000, 100, 10, 1)
        var given = number

        for (i in divider){
            if(given / i > 0) {
                result += (given / i).toString()

                if(i != 1)
                    result += SPACES
            }
            given -= ((given / i) * i)
        }

        return result
    }
}