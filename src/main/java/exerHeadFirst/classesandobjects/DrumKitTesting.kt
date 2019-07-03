package exerHeadFirst.classesandobjects

fun main(){
    val hasTopHat = true
    val noTopHat = !hasTopHat

    val hasSnare = true
    val noSnare = !hasSnare

    val drumKitA = DrumKit("Drum Kit A", hasTopHat, noSnare)
    val drumKitB = DrumKit("Drum Kit B", noTopHat, hasSnare)
    val drumKitC = DrumKit("Drum Kit C", noTopHat, noSnare)

    drumKitA.playSnare()
    drumKitB.playSnare()
    drumKitC.playSnare()

    drumKitA.playTopHat()
    drumKitB.playTopHat()
    drumKitC.playTopHat()
}