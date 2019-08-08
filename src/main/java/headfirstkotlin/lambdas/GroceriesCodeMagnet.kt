package headfirstkotlin.lambdas

data class Grocery(val name: String, val category: String, val unit: String, val unitPrice: Double)

fun main(){
    val groceries = listOf(
            Grocery("Tomatoes","Vegetable","lb",3.0),
            Grocery("Mushrooms","Vegetable","lb",4.0),
            Grocery("Bagels","bakery","Pack",1.5),
            Grocery("Olive Oil","Pantry","Bottle",6.0),
            Grocery("Ice Cream","Frozen","Pack",3.0)
    )

    println("Expensive ingredients:")
    search(groceries){i: Grocery -> i.unitPrice > 5.0}
}

fun search(groceries: List<Grocery>, criteria:(g:Grocery)-> Boolean){

    for(grocery in groceries){
        if(criteria(grocery))println(grocery.name)
    }
}