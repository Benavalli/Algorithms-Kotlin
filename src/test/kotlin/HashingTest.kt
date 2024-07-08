import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class HashingTest {

    @Test
    fun findCommonNumbers() {
        val matrix = arrayOf(intArrayOf(3,1,2,4,5), intArrayOf(1,2,3,4), intArrayOf(3,4,5,6))
        val result = Hashing().findCommonNumbers(matrix)
        assert(result.contentEquals(intArrayOf(3, 4)))
    }

    @Test
    fun allCharactersSameFrequency() {
        val sameFrequencyWord = "abacbc"
        val notSameFrequencyWord = "aaabb"
        val result = Hashing().allCharactersSameFrequency(sameFrequencyWord)
        val result2 = Hashing().allCharactersSameFrequency(notSameFrequencyWord)
        assertTrue(result)
        assertFalse(result2)
    }

    @Test
    fun numberOfSubArraysSumEqualToK() {
        val inputArray = intArrayOf(1, 2, 1, 2, 1)
        val sum = 3
        val result = Hashing().numberOfSubArraysSumEqualToK(inputArray, sum)

        assertTrue(result == 4)
    }
}