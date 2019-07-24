package headfirstkotlin.classesandobjects

class DrumKit(val name: String, var hasTopHat : Boolean, var hasSnare : Boolean){
    fun playSnare(){
        if(hasSnare) println("$name:bang bang bang")
    }

    fun playTopHat(){
        if(hasTopHat) println("$name:ding ding ba-da-bing")
    }
}