package programmrexercises

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class PalindromeTest{
    private val palindromeTest : Palindrome = Palindrome()

    @Test
    internal fun test_palindrome_when_given_is_level_then_true() {
        assertTrue(palindromeTest.isPalindrome("level"))
    }

    @Test
    internal fun test_palindrome_when_given_is_aso_then_false() {
        assertFalse(palindromeTest.isPalindrome("aso"))
    }
}