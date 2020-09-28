package chapter4

import chapter1.Dollar
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DollarTest {

    @Test
    fun testMultiplication() {
        val five = Dollar(5);
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5) == Dollar(5))
        assertFalse(Dollar(5) == Dollar(6))
        assertFalse(Dollar(5) == null)
    }

}