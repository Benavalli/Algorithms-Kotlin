package arrays_strings.two_pointers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SlidingWindowTest {

    @Test
    fun maximumSubArraySizeLessOrEqualTarget() {
        val result = SlidingWindow().maximumSubArraySizeLessOrEqualTarget(intArrayOf(3, 1, 2, 7, 4, 2, 1, 1, 5), 8)
        assertEquals(result, 4)
    }
}