package ch4.localfunctions

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FizzBuzzTest{
    val fizzbuzz = FizzBuzz()

    @Test
    internal fun test_fizzBuzz() {
        assertEquals("Fizz Buzz", fizzbuzz.fizzBuzz(15))
    }
}