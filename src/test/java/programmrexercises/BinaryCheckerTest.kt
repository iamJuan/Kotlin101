package programmrexercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BinaryCheckerTest{
    private val binaryChecker : BinaryChecker = BinaryChecker()
    @Test
    internal fun test_binary_checker_when_1010101_then_Binary() {
        assertEquals(binaryChecker.determineIfBinary("1010101"), "Binary")
    }
    @Test
    internal fun test_binary_checker_when_90401_then_Binary() {
        assertEquals(binaryChecker.determineIfBinary("90401"), "NotBinary")
    }
}