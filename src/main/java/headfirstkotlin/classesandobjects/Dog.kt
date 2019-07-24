package headfirstkotlin.classesandobjects

class Dog (val name : String, weight_param: Int, val breed: String){
    var activities = arrayOf("Walk")
    val dogBreed = breed.toUpperCase()
//    var temperament : String = ""
//  i dont need it to be initialized inside my class so
//    lateinit var temperament : String

    var weight = weight_param
        set(value){
            if(value > 0) field = value
        }

    val weightInKgs : Double
        get() = weight / 2.2

    init{
        println("Dog $name has been created")
    }

    fun bark(){
        println(if (weight < 20) "Yip!" else "Woof!")
    }

}