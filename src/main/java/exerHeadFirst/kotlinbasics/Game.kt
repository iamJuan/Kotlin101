package exerHeadFirst.kotlinbasics

fun main(){
    val options = arrayOf("Rock", "Paper", "Scissor")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    determineWinner(gameChoice, userChoice)
}

fun getGameChoice(optionsParam : Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>) : String{
    var isValidChoice = false
    var userChoice = ""

    while(!isValidChoice){
        println("Please enter one of the following: Rock Paper Scissors.")
        for(item in optionsParam) print(" $item")
        println(".")
        val userInput = readLine()

        if(userInput != null && userInput in optionsParam){
            isValidChoice = true
            userChoice = userInput
        }

        if(!isValidChoice) println("You must enter a valid choice")
    }
    return userChoice
}

fun determineWinner(gameChoice : String, userChoice : String){
    var result : String = ""

    if(userChoice.equals(gameChoice)) result = "TIE!"
    else if((userChoice.equals("Rock") && gameChoice.equals("Scissors")) ||
            (userChoice.equals("Rock") && gameChoice.equals("Scissors")) ||
            (userChoice.equals("Rock") && gameChoice.equals("Scissors"))) result = "YOU WIN!"
    else result = "YOU LOSE!"

    println("You chose $userChoice. I chose $gameChoice. $result")
}