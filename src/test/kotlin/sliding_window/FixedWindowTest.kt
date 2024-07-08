package sliding_window

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FixedWindowTest {

    @Test
    fun arrayWindowLengthK() {
        val result1 = FixedWindow().arrayWindowLengthK(intArrayOf(1, 2, 3, 4), 3)
        val assert1 = intArrayOf(2, 3)
        val result2 = FixedWindow().arrayWindowLengthK(intArrayOf(1, 2, 3, 4, 5), 3)
        val assert2 = intArrayOf(2, 3, 4)
        assertTrue(result1.contentEquals(assert1))
        assertTrue(result2.contentEquals(assert2))
    }
}