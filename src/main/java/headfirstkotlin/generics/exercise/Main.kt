package headfirstkotlin.generics.exercise

import headfirstkotlin.generics.sample.pets.Cat
import headfirstkotlin.generics.sample.pets.Fish

fun main(){
    val fuzz = Cat("Fuzz")
    val catsu = Cat("Catsu")
    val finny = Fish("Finny")
    val catOwner = PetOwner(fuzz)
    catOwner.add(catsu)

    println(catOwner.pets[0].name)
    println(catOwner.pets[1].name)
}