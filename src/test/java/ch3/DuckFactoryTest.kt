package ch3

import someexercises.basicinheritance.DuckFactory
import someexercises.basicinheritance.RealDuck
import someexercises.basicinheritance.ToyDuck
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

