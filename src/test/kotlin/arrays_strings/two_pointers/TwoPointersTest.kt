package arrays_strings.two_pointers

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TwoPointersTest {

    @Test
    fun isStringPalindrome() {
        val result1 = TwoPointers().isStringPalindrome("racecar")
        val result2 = TwoPointers().isStringPalindrome("aceba")
        val result3 = TwoPointers().isStringPalindrome("o")
        assertTrue(result1)
        assertFalse(result2)
        assertTrue(result3)
    }

    @Test
    fun isStringPalindromeRecursive() {
        val result1 = TwoPointers().isStringPalindromeRecursive("racecar")
        val result2 = TwoPointers().isStringPalindromeRecursive("aceba")
        val result3 = TwoPointers().isStringPalindromeRecursive("o")
        assertTrue(result1)
        assertFalse(result2)
        assertTrue(result3)
    }


    @Test
    fun existPairOfNumbersMatchingSum() {
        val result = TwoPointers().existPairOfNumbersMatchingSum(intArrayOf(1, 2, 4, 6, 8, 9, 14, 15), 13)
        assertTrue(result)
    }

    @Test
    fun combineTwoSortedArrays() {
        val result = TwoPointers().combineTwoSortedArrays(intArrayOf(1, 4, 7, 20), intArrayOf(3, 5, 6))
        assertTrue(result.contentEquals(intArrayOf(1, 3, 4, 5, 6, 7, 20)))
    }

    @Test
    fun isFirstStringSubsequenceOfSecondString() {
        val result = TwoPointers().isFirstStringSubsequenceOfSecondString("ace", "abcde")
        assertTrue(result)
    }

    @Test
    fun reverseCharArray() {
        val result = TwoPointers().reverseCharArray(charArrayOf('o', 'v', 'a'))
        assertTrue(result.contentEquals(charArrayOf('a', 'v', 'o')))
    }

    @Test
    fun reverseCharArrayRecursive() {
        val result = TwoPointers().reverseCharArrayRecursive(charArrayOf('o', 'v', 'a'))
        assertTrue(result.contentEquals(charArrayOf('a', 'v', 'o')))
    }

    @Test
    fun moveZeroes() {
        val result = TwoPointers().moveZeroes(intArrayOf(0,1,0,3,12))
        assertTrue(result.contentEquals(intArrayOf(1,3,12,0,0)))
    }
}
