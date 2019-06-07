package ExerCh4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StudentAverageTest{
    private val studentAverage = StudentAverage()

    @Test
    internal fun test_getAverage_when_average_is_greater_than_80_then_3() {
        assertEquals(3, studentAverage.getAverage(arrayListOf(89.4f, 80.5f, 80.0f)))
    }

    @Test
    internal fun test_getAverage_when_average_is_greater_than_90_then_4() {
        assertEquals(4, studentAverage.getAverage(arrayListOf(89.4f, 90.5f, 90.0f, 100f)))
    }
}