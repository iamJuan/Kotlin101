package exerHeadFirst.subclassesandsuperclasses.abstractandinterface

fun main(){
    val animals : Array<Animal> = arrayOf(Hippo(), Wolf())

    for (item in animals){
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val vehicle = Vehicle()
    vehicle.roam()

    val roamables : Array<Roamable> = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables){
        when(item){
            is Wolf -> item.eat()
            is Animal -> item.sleep()
            else -> println("$item is not an animal")
        }
    }
}