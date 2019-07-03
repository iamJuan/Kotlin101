package exerHeadFirst.subclassesandsuperclasses.abstractandinterface

interface Roamable {
    var velocity : Int
        get() = 20
        set(value) {
            println("Unmodifiable velocity")
        }

    fun roam()
}