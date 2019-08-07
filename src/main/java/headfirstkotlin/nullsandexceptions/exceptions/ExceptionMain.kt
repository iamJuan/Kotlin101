package headfirstkotlin.nullsandexceptions.exceptions

fun main(){
    val badException = BadException()
    badException.myFunction("x")
    println()
    badException.myFunction("yes")
}