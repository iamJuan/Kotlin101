package headfirstkotlin.generics.retailer

import headfirstkotlin.generics.sample.pets.Dog

class DogRetailer : Retailer<Dog>{
    override fun sell(): Dog {
        println("Sell Dog")
        return Dog("")
    }
}