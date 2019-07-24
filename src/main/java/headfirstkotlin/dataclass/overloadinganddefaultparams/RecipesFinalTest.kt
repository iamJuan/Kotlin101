package headfirstkotlin.dataclass.overloadinganddefaultparams


fun main(){
    val r1 = Recipes("Thai Curry", "Chicken")
    val r2 = Recipes(title = "Thai Curry", mainIngredient = "Chicken")
    val r3 = r2.copy(title = "Chicken Bunna")
    val r4 = Recipes("Vegetable Salad", "Broccoli", true)

    println("r1 hash code : ${r1.hashCode()}")
    println("r2 hash code : ${r2.hashCode()}")
    println("r3 hash code : ${r3.hashCode()}")
    println("r1 toString : ${r1.toString()}")
    println("r1 == r2 ? ${r1 == r2}")
    println("r1 === r2 ? ${r1 === r2}")
    println("r1 == r3 ? ${r1 == r3}")
    val (title, mainIngredient, vegetarian, difficulty) = r1
    println("title is $title and vegetarian is $vegetarian")

    val (titler4, mainIngredientr4, vegetarianr4, difficultyr4) = r4
    println("title is $titler4, main ingredient is $mainIngredientr4 and vegetarian is $vegetarianr4")

    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")

    val m2 = Mushroom(true)
    println("m1 size is ${m2.size} and isMagic is ${m2.isMagic}")

    println(addNumbers(6, 2))
    println(addNumbers(5.5, 2.5))
}

fun findRecipes(title : String = "", ingredient : String = "",
                isVegetarian : Boolean = false, difficulty : String = "") : Array<Recipes>{

    return arrayOf(Recipes(title, ingredient, isVegetarian, difficulty))
}

fun addNumbers(a : Int, b : Int) : Int{
    return a + b
}

fun addNumbers(a : Double, b : Double) : Double{
    return a + b
}
