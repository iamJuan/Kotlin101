package ch3

import ch3.BasicInheritance.DuckFactory
import ch3.BasicInheritance.RealDuck
import ch3.BasicInheritance.ToyDuck
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DuckFactoryTest{
    private val duckFactory = DuckFactory()

    @Test
    internal fun test_getDuck_when_EASY_then_return_EasyDuck() {
         assert(true, { duckFactory.getDuck("EASY") is ToyDuck })
    }

    @Test
    internal fun test_getDuck_when_DuckToy_then_could_not_swim() {
        val duck = duckFactory.getDuck("EASY") as ToyDuck
        assertFalse(duck.canSwim())
    }

    @Test
    internal fun test_getDuck_when_DuckReal_then_could_swim() {
        val duck = duckFactory.getDuck("REAL") as RealDuck
        assertTrue(duck.canSwim())
    }
}

