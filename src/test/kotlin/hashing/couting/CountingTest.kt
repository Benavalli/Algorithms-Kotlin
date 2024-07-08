package hashing.couting

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CountingTest {

    @Test
    fun longestSubstringWithKRepeatedNumberOfCharacters() {
        val result = Counting().longestSubstringWithKRepeatedNumberOfCharacters("eceba", 2)
        assertEquals(result, 3)
    }

    @Test
    fun numJewelsInStones() {
        val result = Counting().numJewelsInStones("aA", "aAAbbbb")
        assertEquals(result, 3)
    }

    @Test
    fun canConstruct() {
        val result = Counting().canConstruct("aa", "aaabc")
        assertTrue(result)
    }

    @Test
    fun returnNumberSubArraysWithSumExactlyEqualK() {
        val result = Counting().returnNumberSubArraysWithSumExactlyEqualK(intArrayOf(1, 2, 1, 2, 1), 3)
        assertEquals(result, 4)
    }

    @Test
    fun returnNumberSubArraysWithExactlyNumberOfOddNumbers() {
        val result = Counting().returnNumberSubArraysWithExactlyNumberOfOddNumbers(intArrayOf(1, 1, 2, 1, 1), 3)
        assertEquals(result, 2)
    }
}