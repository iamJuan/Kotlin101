package someexercises.exerch4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SmallestIntTest{

    private var smallestInt = SmallestInt()

    @Test
    internal fun test_getSmallestInt() {
        val userGiven = arrayOf(9, 2, 3, 5, 6)
        assertEquals(2, smallestInt.getSmallestInt(userGiven))
    }
}