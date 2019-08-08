package someexercises.ExerCh4

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

internal class PerfectNumberTest{

    private val perfectNumber = PerfectNumber()

    @Test
    internal fun test_isPerfectNumber_when_6_is_given_then_true() {
        assert(perfectNumber.isPerfectNumber(6))
    }

    @Test
    internal fun test_isPerfectNumber_when_12_is_given_then_false() {
        assertFalse(perfectNumber.isPerfectNumber(12))
    }

    @Test
    internal fun test_isPerfectNumber_when_1000_is_given_then_false() {
        assertFalse(perfectNumber.isPerfectNumber(1000))
    }
}