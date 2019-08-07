package headfirstkotlin.nullsandexceptions.nullvalues.poolpuzzle8

class MyLions(var myLions: Array<Lion?>) {

    fun roar(){
        for(lion in myLions){
            lion?.let { it.roar() }
        }
    }

    fun totalLionHeight():Int{
        var h : Int = 0

        for(lion in myLions){
            h += lion?.height ?: 0
        }

        return h
    }
}