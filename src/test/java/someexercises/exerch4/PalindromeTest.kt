package someexercises.exerch4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PalindromeTest{
    private var palindrome = Palindrome()

    @Test
    internal fun test_word_is_palindrome() {
        palindrome.toPalindrome("ararara")
        assertEquals("ararara", palindrome.getPalindrome())
    }
}