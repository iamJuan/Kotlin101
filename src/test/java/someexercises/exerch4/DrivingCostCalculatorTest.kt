package someexercises.exerch4

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.RoundingMode
import java.text.DecimalFormat

class DrivingCostCalculatorTest() {
    private var drivingCostCalculator = DrivingCostCalculator()

    @Test
    internal fun test_getTankful() {
        assertEquals(2, drivingCostCalculator.getTankful(10, 5))
    }

    @Test
    internal fun test_getTotal() {
        drivingCostCalculator.getTankful(10, 5)
        drivingCostCalculator.getTankful(20, 4)

        assertEquals(7.toFloat(), drivingCostCalculator.total)
    }

    @Test
    internal fun test_getAverage() {
        val df = DecimalFormat("#.#")
        df.roundingMode = RoundingMode.CEILING

        drivingCostCalculator.getTankful(10, 5)
        drivingCostCalculator.getTankful(20, 4)
        drivingCostCalculator.getTankful(35, 5)

        assertEquals(14.toFloat(), drivingCostCalculator.total)
        assertEquals("4.7", df.format(drivingCostCalculator.getAverage()))
    }
}