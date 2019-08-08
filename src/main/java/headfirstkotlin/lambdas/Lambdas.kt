package headfirstkotlin.lambdas

fun main() {
    var addFive = {x : Int -> x+5}
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInts = {x : Int, y : Int -> x + y}
    val result = addInts.invoke(8, 8)
    println("Pass 8, 8 to addInts:$result")

    val intLambda : (Int, Int) -> Int = {x, y -> x*y}
    println("Pass 10, 11 to IntLambda: ${intLambda(10,11)}")

    val addSeven : (Int) -> Int = {it + 7}
    println("Pass 69 to addSeven:${addSeven(69)}")

    val myLambda : () -> Unit = {println("Hello Lambda!")}
    myLambda

    convert(6.0) {
        it * 1.8 + 32
    }

    convertFive {
        it * 1.8 + 32
    }

    //Convert 2.5kg to pounds
    println("Convert 2.5kg to Pounds: ${getConversionLambda("KgsToPounds")(2.5)}")

    //Define two conversion lambdas
    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")

    val kgsToUSTonsLambda = combine(kgsToPoundsLambda, poundsToUSTonsLambda)
    val value = 1.74
    println("$value kgs is ${convert(value, kgsToUSTonsLambda)} US Tons")
}

typealias DoubleConversion = (Double) -> Double

fun convert(x : Double, converter: DoubleConversion):Double{
    val res = converter(x)
    println("$x converted to $res")
    return res
}

fun convertFive(converter: (Int) -> Double) : Double{
    val res = converter(5)
    println("5 converted to $res")
    return res
}

fun getConversionLambda(str:String) : DoubleConversion {
    if(str == "CentigradeToFahrenheit")
        return {it * 1.8 + 32}
    else if(str == "KgsToPounds")
        return {it * 2.204623}
    else if(str == "PoundsToUSTons")
        return {it / 2000.0}
    else
        return {it}
}

fun combine(lambda1 : DoubleConversion, lambda2: DoubleConversion) : DoubleConversion{
    return {x : Double -> lambda2(lambda1(x))}
}