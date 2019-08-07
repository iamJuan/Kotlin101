package headfirstkotlin.collections.set

fun main(){
    var mShoppingList = mutableListOf("milk","coffee","eggs","dishwasher")
    println("mShopping original: $mShoppingList")

    val extraShopping = listOf("cookies","potato chips","bacon")
    mShoppingList.addAll(extraShopping)
    println("mShopping items added: $mShoppingList")

    if(mShoppingList.contains("coffee")){
        mShoppingList.set(mShoppingList.indexOf("coffee"),"choco drink")
    }

    mShoppingList.sort()
    println("mShopping sorted: $mShoppingList")

    mShoppingList.reverse()
    println("mShopping reversed: $mShoppingList")

    val mShoppingSet = mShoppingList.toMutableSet()
    println("mShoppingSet: $mShoppingSet")

    val moreShopping = setOf("chives","spinach","milk")
    mShoppingSet.addAll(moreShopping)
    println("mShoppingSet items added: $mShoppingSet")

    mShoppingList = mShoppingSet.toMutableList()
    println("mShopping new version: $mShoppingList")
}