package monotonic

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MonotonicTest {

    @Test
    fun dayToWaitTillWarmerDay() {
        val result = Monotonic().dayToWaitTillWarmerDay(intArrayOf(40, 35, 32, 37, 50))
        assertTrue(result.contentEquals(intArrayOf(4, 2, 1, 1, 0)))
    }
}