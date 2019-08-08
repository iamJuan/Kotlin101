package someexercises.exerch4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IntegersWithSpaceTest{
    private var integersWithSpace = IntegersWithSpace()

    @Test
    internal fun test_getIntWithSpaces_when_4526_then_4__5__2__6() {
        assertEquals("4  5  2  6", integersWithSpace.getIntWithSpaces(4526))
    }
    @Test
    internal fun test_getIntWithSpaces_when_321_then_3__2__1() {
        assertEquals("3  2  1", integersWithSpace.getIntWithSpaces(321))
    }
    @Test
    internal fun test_getIntWithSpaces_when_1_then_1() {
        assertEquals("1", integersWithSpace.getIntWithSpaces(1))
    }
}