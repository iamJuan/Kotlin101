package someexercises.ExerCh4

class StudentAverage {

    fun getAverage(given: ArrayList<Float>) : Int{
        var average: Float
        var totalGrade = 0.0f

        for (iter in 1..given.size){
            totalGrade += given[iter-1]
        }

        average = totalGrade / given.size

        return when (average) {
            in 90f..100f -> 4
            in 80f..89.9f -> 3
            in 70f..79.9f -> 2
            in 60f..69.9f -> 1
            else -> 0
        }
    }
}