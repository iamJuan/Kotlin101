package someexercises.exerch4

class SmallestInt {

    fun getSmallestInt(given: Array<Int>) : Int {
        var smallestInt = given[0]

        for(iter in given){
            if (iter < smallestInt)
                smallestInt = iter
        }
        return smallestInt
    }
}