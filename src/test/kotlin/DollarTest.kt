import chapter1.Dollar
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class DollarTest {

    @Test
    fun testMultiplication() {
        val five = Dollar(5);
        five.times(3)
        assertEquals(15, five.amount)
    }

}