package someexercises.ExerCh4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CreditLimitTest {

    @Test
    internal fun test_user_exceeding_limit() {
        val creditLimitA = CreditLimit("12345", 1000.0f, 5, 800.0f, 500.0f)
        assertEquals("12345", creditLimitA.acctNo)
        assertEquals(true, creditLimitA.isCreditExceeded())
    }


    @Test
    internal fun test_user_not_exceeding_limit() {
        val creditLimitA = CreditLimit("32169", 1500.0f, 2, 700.0f, 500.0f)
        assertEquals("32169", creditLimitA.acctNo)
        assertEquals(true, creditLimitA.isCreditExceeded())
    }
}