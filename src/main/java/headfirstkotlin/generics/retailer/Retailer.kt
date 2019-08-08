package headfirstkotlin.generics.retailer

//added "out" for covariant cases where a subtype can be used in place of supertype
//You can’t, however, use out if the class has function parameters or var properties of that generic type. -Head First
interface Retailer<out T>{
    fun  sell(): T
}