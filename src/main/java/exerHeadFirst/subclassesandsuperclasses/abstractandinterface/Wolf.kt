package exerHeadFirst.subclassesandsuperclasses.abstractandinterface

class Wolf : Canine(){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "land"

    override fun makeNoise() {
        println("Awoooooo!")
    }

    override fun eat(){
        println("Wolf is eating $food")
    }
}