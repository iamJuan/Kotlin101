package programmrexercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class NumberToStringTest{
    @Test
    internal fun test_when_4_then_four() {
        val numberToStringTest = NumberToString(4)
        assertEquals(numberToStringTest.convert(), "four")
    }

    @Test
    internal fun test_when_69_then_sixty_nine() {
        val numberToStringTest = NumberToString(69)
        assertEquals(numberToStringTest.convert(), "sixty nine")
    }

    @Test
    internal fun test_when_123_then_one_hundred_twenty_three() {
        val numberToStringTest = NumberToString(123)
        assertEquals(numberToStringTest.convert(), "one hundred twenty three")
    }

    @Test
    internal fun test_when_123_then_one_hundred_eighteen() {
        val numberToStringTest = NumberToString(118)
        assertEquals(numberToStringTest.convert(), "one hundred eighteen")
    }

}