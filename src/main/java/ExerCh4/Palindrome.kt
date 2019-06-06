package ExerCh4

class Palindrome {
    var pal : String = ""

    fun toPalindrome(word : String){
        var wordAr = word.toCharArray()
        var arrlen = wordAr.size.downTo(1)

        for(c in arrlen){
            pal += "${wordAr.get(c-1)}"
        }
    }

    fun getPalindrome():String = pal
}