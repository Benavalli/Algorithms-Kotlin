package arrays_strings.sliding_window

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SlidingWindowTest {

    @Test
    fun maximumSubArraySizeLessOrEqualTarget() {
        val result = SlidingWindow().maximumSubArraySizeLessOrEqualTarget(intArrayOf(3, 1, 2, 7, 4, 2, 1, 1, 5), 8)
        assertEquals(result, 4)
    }

    @Test
    fun maximumSubArraySizeLessOrEqualTargetReturningArray() {
        val result = SlidingWindow().maximumSubArraySizeLessOrEqualTargetReturningArray(intArrayOf(3, 1, 2, 7, 4, 2, 1, 1, 5), 8)
        assertTrue(result.contentEquals(intArrayOf(4, 2, 1, 1)))
    }

    @Test
    fun longestBinarySubstringHavingOnlyOneZeroThaCanBeFlipped() {
        val result = SlidingWindow().longestBinarySubstringHavingOnlyOneZeroThaCanBeFlipped("1101100111")
        assertEquals(result, 5)
    }

    @Test
    fun numberOfSubArraysProductLessThanTarget() {
        val result = SlidingWindow().numberOfSubArraysProductLessThanTarget(intArrayOf(10, 5, 2, 6), 100)
        assertEquals(result, 8)
    }

    @Test
    fun maxSumFixedWindow() {
        val result = SlidingWindow().maxSumFixedWindow(intArrayOf(3, -1, 4, 12, -8, 5, 6), 4)
        assertEquals(result, 18)
    }

    @Test
    fun maxVowels() {
        val result1 = SlidingWindow().maxVowels("abciiidef", 3)
        val result2 = SlidingWindow().maxVowels("leetcode", 3)
        assertEquals(result1, 3)
        assertEquals(result2, 2)
    }
}