package headfirstkotlin.dataclass.overloadinganddefaultparams

data class Recipes(val title : String,
                   val mainIngredient : String,
                   val isVegetarian : Boolean = false,
                   val difficulty : String = "Easy")