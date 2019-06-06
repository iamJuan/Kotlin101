package ExerCh4

class DrivingCostCalculator{
    var total : Float = 0.0f
    var tankfulCtr : Int = 0;

    fun getTankful(mile : Int, gallon  : Int): Int {
        addTotal(mile, gallon)
        return mile / gallon
    }

    private fun addTotal(mile: Int, gallon: Int) {
        total += mile / gallon
        tankfulCtr++
    }

    fun getAverage() : Float = total / tankfulCtr
}