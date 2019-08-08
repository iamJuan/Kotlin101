package headfirstkotlin.generics.retailer

import headfirstkotlin.generics.sample.pets.Cat

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell cat")
        return Cat("")
    }
}