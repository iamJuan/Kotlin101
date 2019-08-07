package headfirstkotlin.collections.list

fun main(){
    val numbers = mutableListOf("Zero","Two","Four","Six")
    println("$numbers")

    if(numbers.contains("Zero")){
        numbers.remove("Zero")
    }

    numbers.add("Eight")
    println("$numbers")

    numbers.add("Ten")
    println("$numbers")
}