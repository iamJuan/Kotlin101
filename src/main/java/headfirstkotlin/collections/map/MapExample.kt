package headfirstkotlin.collections.map


data class Recipes(var title : String)

fun main(){
    val r1 = Recipes("Chicken Soup")
    val r2 = Recipes("Quinoa Salad")
    val r3 = Recipes("Thai Curry")
    val r4 = Recipes("Jambalaya")
    val r5 = Recipes("Sausage Rolls")

    val mRecipeMap = mutableMapOf("RecipeA" to r1, "RecipeB" to r2, "RecipeC" to r3)
    println("mRecipeMap original: $mRecipeMap")

    val recipesToAdd = mutableMapOf("RecipeD" to r4, "RecipeE" to r5)
    mRecipeMap.putAll(recipesToAdd)

    println("mRecipeMap updated: $mRecipeMap")

    if(mRecipeMap.containsKey("RecipeA")){
        println("RecipeA is: ${mRecipeMap.getValue("RecipeA")}")
    }
}