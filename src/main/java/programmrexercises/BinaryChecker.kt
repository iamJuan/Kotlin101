package programmrexercises

class BinaryChecker{

    fun determineIfBinary(given:String) : String
            = if(containsTwoToNine(given)) "NotBinary" else "Binary"

    private fun containsTwoToNine(given: String): Boolean {
        val nonBinary = 2..9
        for(iter in nonBinary){
            if(given.contains(iter.toString())) return true
        }
        return false
    }
}