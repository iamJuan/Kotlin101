package ExerCh4

class CreditLimit( val acctNo : String, val initBal : Float, var totalItems : Int, val totalCredit : Float, val creditLimit : Float){
    private val charges = totalItems * 100.00f;

    private fun getBalance() : Float = initBal + charges - totalCredit
    fun isCreditExceeded() : Boolean = getBalance() > creditLimit
}