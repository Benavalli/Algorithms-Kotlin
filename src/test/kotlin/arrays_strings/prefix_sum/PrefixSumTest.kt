package arrays_strings.prefix_sum

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PrefixSumTest {

    @Test
    fun answerQueries() {
        val result = PrefixSum().answerQueries(intArrayOf(1, 6, 3, 2, 7, 2), arrayOf(intArrayOf(0, 3), intArrayOf(2, 5), intArrayOf(2, 4)), 13)
        assertTrue(result.contentEquals(booleanArrayOf(true, false, true)))
    }

    @Test
    fun numbersOfWaysToSplitArrayFirstPartGreaterOrEqualSecond() {
        val result = PrefixSum().numbersOfWaysToSplitArrayFirstPartGreaterOrEqualSecond(intArrayOf(10, 4, -8, 7))
        assertEquals(result, 2)
    }

    @Test
    fun largestAltitude() {
        val result1 = PrefixSum().largestAltitude(intArrayOf(-5, 1, 5, 0, -7))
        val result2 = PrefixSum().largestAltitude(intArrayOf(-4, -3, -2, -1, 4, 3, 2))
        assertEquals(result1, 1)
        assertEquals(result2, 0)
    }
}