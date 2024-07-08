package hashing.checking_existence

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CheckingExistenceTest {

    @Test
    fun givenUnsortedIntegerArrayGetPairsThatSumEqualTarget() {
        val result = CheckingExistence()
            .givenUnsortedIntegerArrayGetPairsThatSumEqualTarget(intArrayOf(5, 2, 7, 10, 3, 9), 8)
        assertArrayEquals(result, arrayOf(intArrayOf(0, 4)))
    }

    @Test
    fun returnFirstCharThatAppearTwice() {
        val result = CheckingExistence().returnFirstCharThatAppearTwice("abcjjlkju")
        assertEquals(result, 'j')
    }

    @Test
    fun missingNumber() {
        val result = CheckingExistence().missingNumber(intArrayOf(3, 0, 1))
        assertEquals(result, 2)
    }
}