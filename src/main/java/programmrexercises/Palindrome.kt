package programmrexercises

class Palindrome{
        fun isPalindrome(given:String):Boolean{
            return given == given.reversed()
        }
}