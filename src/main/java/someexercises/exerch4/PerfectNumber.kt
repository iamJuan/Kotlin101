package someexercises.exerch4

class PerfectNumber{

    fun isPerfectNumber(number : Int) : Boolean{
        var sum = 0

        for (n in 1..number){
            if(sum < number){
                sum += n
            }
        }

        return sum == number
    }
}