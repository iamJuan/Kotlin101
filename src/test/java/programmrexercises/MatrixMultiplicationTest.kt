package programmrexercises

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class MatrixMultiplicationTest{
    var matrix1 = Array(2) {IntArray(3)}
    var matrix2 = Array(3) {IntArray(2)}
    @BeforeEach
    internal fun setUp() {
        matrix1[0][0] = 1
        matrix1[0][1] = 2
        matrix1[0][2] = 3
        matrix1[1][0] = 4
        matrix1[1][1] = 5
        matrix1[1][2] = 6

        matrix2[0][0] = 7
        matrix2[0][1] = 8
        matrix2[1][0] = 9
        matrix2[1][1] = 10
        matrix2[2][0] = 11
        matrix2[2][1] = 12
    }

    //[1][2][3]     [7][8]
    //[4][5][6]  x  [9][10]
    //              [11][12]
    @Test
    internal fun test_when_first_2_matrix() {
        val matrixMultiplicationTest = MatrixMultiplication(matrix1, matrix2)
        val resultMatrix = Array(2) {IntArray(2)}
        resultMatrix[0][0] = 58
        resultMatrix[1][0] = 64
        resultMatrix[0][1] = 139
        resultMatrix[1][1] = 154

        assertEquals(matrixMultiplicationTest.getResult(), resultMatrix)
    }
}