package headfirstkotlin.generics.sample

import headfirstkotlin.generics.retailer.CatRetailer
import headfirstkotlin.generics.retailer.DogRetailer
import headfirstkotlin.generics.retailer.Retailer
import headfirstkotlin.generics.sample.contest.Contest
import headfirstkotlin.generics.sample.pets.Cat
import headfirstkotlin.generics.sample.pets.Dog
import headfirstkotlin.generics.sample.pets.Fish
import headfirstkotlin.generics.sample.pets.Pet
import headfirstkotlin.generics.sample.vet.Vet

fun main(){
    val fuzz = Cat("Fuzz")
    val catsu = Cat("Catsu")
    val finny = Fish("Finny")

    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    val catContest = Contest<Cat>(catVet)
    catContest.addScore(fuzz, 50)
    catContest.addScore(catsu, 30)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(fuzz, 20)
    petContest.addScore(finny, 30)
    val topPet = petContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    val fishContest = Contest<Fish>(petVet)
    val scaly = Fish("Scaly")
    val parrotFish = Fish("Parrot Fish")
    fishContest.addScore(scaly, 10)
    fishContest.addScore(parrotFish, 20)
    val topFish = fishContest.getWinners().first()
    println("Fish contest winner is ${topFish.name}")

    val dogRetailer : Retailer<Dog> = DogRetailer()
    val catRetailer : Retailer<Cat> = CatRetailer()
    val petRetailer : Retailer<Pet> = CatRetailer()
    dogRetailer.sell()
    catRetailer.sell()
    petRetailer.sell()

    catVet.treat(Cat("Fuzz"))
    petVet.treat(Cat("Catsu"))
    fishVet.treat(Fish("Finny"))
}