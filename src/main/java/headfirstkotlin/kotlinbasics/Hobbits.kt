package headfirstkotlin.kotlinbasics

fun main(){
    val hobbits : Array<String> = arrayOf("Frodo", "Sam", "Merry", "Pippin")
    var x = 0

    while(x < 4){
        println("${hobbits[x]} is a good Hobbit name")
        x++
    }
}