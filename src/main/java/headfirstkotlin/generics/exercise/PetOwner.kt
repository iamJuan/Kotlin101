package headfirstkotlin.generics.exercise

import headfirstkotlin.generics.sample.pets.Pet

class PetOwner<T:Pet>(t:T) {
    val pets = mutableListOf(t)

    fun add(t:T){
        pets.add(t)
    }

    fun remove(t:T){
        pets.remove(t)
    }
}