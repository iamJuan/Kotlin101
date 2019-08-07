package headfirstkotlin.nullsandexceptions.nullvalues.anteater

fun main() {

    var antEater : Anteater? = Anteater()

    if(antEater != null){
        antEater.eat()
    }

    var x = antEater?.hunger
    println("The value of x is ${x}")

    var y = antEater?.hunger ?: -1
    println("The value of y is ${y}")

    var myAnteater = MyAnteater()
    myAnteater?.anteater?.hunger = 8
    println("The value of myAnteater?.anteater?.hunger is ${myAnteater?.anteater?.hunger}")

    var myArray = arrayOf("Hi","Hello",null)
    for(item in myArray){
        item?.let{println(item)}
    }

    getAlphaAnteater()?.let { it.eat() }

    antEater = null
    var z = antEater!!.hunger
}