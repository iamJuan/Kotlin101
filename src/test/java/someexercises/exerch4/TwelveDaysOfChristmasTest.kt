package someexercises.exerch4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TwelveDaysOfChristmasTest{
    private var twelveDaysOfChristmas = TwelveDaysOfChristmas()

    @Test
    internal fun test_twelveDaysOfChristmas_when_1_then_return_PARTRIDGE() {
        assertEquals(Christmas12Days.PARTRIDGE, twelveDaysOfChristmas.getItem(1))
    }

    @Test
    internal fun test_twelveDaysOfChristmas_when_8_then_return_MAIDS() {
        assertEquals(Christmas12Days.MAIDS, twelveDaysOfChristmas.getItem(8))
    }

    @Test
    internal fun test_twelveDaysOfChristmas_when_12_then_return_DRUMMERS() {
        assertEquals(Christmas12Days.DRUMMERS, twelveDaysOfChristmas.getItem(12))
    }
}