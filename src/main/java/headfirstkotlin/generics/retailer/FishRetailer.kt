package headfirstkotlin.generics.retailer

import headfirstkotlin.generics.sample.pets.Fish

class FishRetailer : Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")
    }
}