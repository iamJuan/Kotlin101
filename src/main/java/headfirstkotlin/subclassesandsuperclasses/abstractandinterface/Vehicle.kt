package headfirstkotlin.subclassesandsuperclasses.abstractandinterface

class Vehicle : Roamable{
    override fun roam() {
        println("Vehicle is roaming")
    }
}