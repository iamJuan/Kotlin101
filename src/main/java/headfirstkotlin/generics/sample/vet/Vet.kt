package headfirstkotlin.generics.sample.vet

import headfirstkotlin.generics.sample.pets.Pet

//added "in" for contravariant(opposite of covariant) cases, it means that you can use a supertype in place of a subtype.
class Vet <T:Pet>{
    fun treat(t: T){
        println("Treat Pet ${t.name}")
    }
}