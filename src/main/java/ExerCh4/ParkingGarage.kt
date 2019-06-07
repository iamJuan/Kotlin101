package ExerCh4

class ParkingGarage{
    val addtlCharge : Float = 0.50f
    val minFee : Float = 2.00f

    fun getParkingCharge(hour : Int) =
            if(hour <= 3) minFee else minFee + (addtlCharge * (hour-3))
}