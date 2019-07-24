package headfirstkotlin.subclassesandsuperclasses.abstractandinterface

class Vet{
    fun giveShot(animal: Animal){
        print("Vet give a shot!")
        animal.makeNoise()
    }
}