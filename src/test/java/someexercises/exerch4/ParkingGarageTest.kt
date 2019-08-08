package someexercises.exerch4

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class ParkingGarageTest{
    val parkingGarage = ParkingGarage()
    @Test
    internal fun test_getParkingCharge_when_5_hours_then_3_dollars() {
        assertEquals(3.00f, parkingGarage.getParkingCharge(5))
    }

    @Test
    internal fun test_getParkingCharge_when_3_hours_then_return_2_dollars() {
        assertEquals(2.00f, parkingGarage.getParkingCharge(3))
    }

    @Test
    internal fun test_getParkingCharge_when_1_hour_then_return_2_dollars() {
        assertEquals(2.00f, parkingGarage.getParkingCharge(1))
    }
}