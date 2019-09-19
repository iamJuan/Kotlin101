package programmrexercises

class MatrixMultiplication(val matrix1: Array<IntArray>, val matrix2: Array<IntArray>) {
    fun getResult(): Array<IntArray> {
        val resultMatrix = Array(2) {IntArray(2)}

        val m1x = 0..1
        val m1y = 0..2

        val m2x = 0..2
        val m2y = 0..1

        for(n in m1x){
            for(m in m1y){
                for(x in m2x){
                    for(y in m2y){

                    }
                }
            }
        }

        return resultMatrix
    }


}