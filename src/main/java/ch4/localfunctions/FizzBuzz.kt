package ch4.localfunctions

class FizzBuzz {
    fun fizzBuzz(k: Int) : String?{
        fun isFizz() : Boolean = k % 3 == 0
        fun isBuzz() : Boolean = k % 5 == 0

        return when{
            isFizz() && isBuzz() -> "Fizz Buzz"
            isFizz() -> "Fizz"
            isBuzz() -> "Buzz"
            else -> return k.toString()
        }
    }
}