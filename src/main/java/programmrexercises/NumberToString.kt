package programmrexercises

class NumberToString(var given: Int) {
    fun convert(): String {
        var result = ""
        result = result.plus(extractHundreds())

        var tens: String = extractTens()

        if (tens.equals("teen")){
            return forTeens(result, tens)
        }else{
            result = result.plus(tens)
        }
        result = result.plus(extractOnes())
        return result
    }

    private fun forTeens(result: String, tens: String): String {
        var result1 = result
        result1 = result1.plus(extractOnes())
        if (result1.get(result1.lastIndex) == 't') {
            result1 = result1.dropLast(1)
        }
        result1 = result1.plus(tens)
        return result1
    }

    private fun extractOnes(): String {
        given %= 10
        return convertDigit(given)
    }

    private fun extractHundreds(): String {
        if(given % 100 != 0 && given >= 100) {
            return convertDigit((given - (given % 100))/100) + " hundred "
        }
        return ""
    }

    private fun extractTens(): String {
        given %= 100
        if(given % 10 != 0 && given >= 10) {
            return convertDigitToTens((given - (given % 10))/10)
        }
        return ""
    }

    private fun convertDigit(i: Int): String {
        return when(i){
            1 -> "one"
            2 -> "two"
            3 -> "three"
            4 -> "four"
            5 -> "five"
            6 -> "six"
            7 -> "seven"
            8 -> "eight"
            9 -> "nine"
            else -> ""
        }
    }

    private fun convertDigitToTens(i: Int): String {
        return when(i){
            1 -> "teen"
            2 -> "twenty "
            3 -> "thirty "
            4 -> "fourty "
            5 -> "fifty "
            6 -> "sixty "
            7 -> "seventy "
            8 -> "eighty "
            9 -> "ninety "
            else -> ""
        }
    }
}