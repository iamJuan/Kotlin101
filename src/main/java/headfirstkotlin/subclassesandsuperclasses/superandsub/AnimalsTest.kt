package headfirstkotlin.subclassesandsuperclasses.superandsub

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
}