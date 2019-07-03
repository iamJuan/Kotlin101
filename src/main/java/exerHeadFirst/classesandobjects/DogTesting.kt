package exerHeadFirst.classesandobjects

fun main(){
    var myDog = Dog("Fido", 70, "Mixed")
    println(myDog.name)

    myDog.weight = 75
    println(myDog.weight)
    println(myDog.weightInKgs)
    println(myDog.breed)

    myDog.bark()

    var othersDogs = arrayOf(
            Dog("Lion", 50, "Hainan"),
            Dog("Oliv", 70, "Okba"))
    println(othersDogs[0].name)
    println(othersDogs[1].name)
}