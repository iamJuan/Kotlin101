package exerHeadFirst.subclassesandsuperclasses.abstractandinterface

abstract class Animal : Roamable{
    abstract val image : String
    abstract val food : String
    abstract val habitat : String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    fun sleep(){
        println("The animal is sleeping")
    }

    override fun roam() {
        println("Animal is roaming")
    }
}