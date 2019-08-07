package headfirstkotlin.nullsandexceptions.exceptions

import java.lang.Exception

class BadException : Exception(){

    fun myFunction(test : String){
        try{
            print("t")
            riskyCode(test)
            print("o")
        }catch (e:BadException){
            print("a")
        }finally {
            print("w")
        }
        print("s")
    }

    private fun riskyCode(test: String) {
        print("h")
        if(test == "yes"){
            throw BadException()
        }
        print("r")
    }
}