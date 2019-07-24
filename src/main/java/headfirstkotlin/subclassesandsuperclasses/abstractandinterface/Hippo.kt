package headfirstkotlin.subclassesandsuperclasses.abstractandinterface

class Hippo : Animal(){
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    init{
        hunger = 20
    }

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }
}