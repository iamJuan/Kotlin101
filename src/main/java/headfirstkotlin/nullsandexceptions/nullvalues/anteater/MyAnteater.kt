package headfirstkotlin.nullsandexceptions.nullvalues.anteater

class MyAnteater {

    var anteater : Anteater? = Anteater()

    fun myFunction(){
        anteater?.eat()
    }
}

fun getAlphaAnteater() : Anteater?{
    return Anteater()
}