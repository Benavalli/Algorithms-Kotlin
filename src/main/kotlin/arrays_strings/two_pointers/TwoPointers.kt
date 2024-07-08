package arrays_strings.two_pointers

import kotlin.math.abs

class TwoPointers {

    // Runtime O(n/2)
    // Space O(1)
    fun isStringPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left < right) {
            if (s[left++] != s[right--]) {
                return false
            }
        }

        return true
    }

    fun isStringPalindromeRecursive(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        return isPalindrome(s, left, right)
    }

    private fun isPalindrome(s: String, left: Int, right: Int): Boolean {
        if (left >= right) {
            return true
        }

        if (s[left] != s[right]) {
            return false
        }

        return isPalindrome(s, left + 1, right -1)
    }

    // To apply two pointers the array needs to be sorted
    fun existPairOfNumbersMatchingSum(nums: IntArray, target: Int): Boolean {
        var left = 0
        var right = nums.size - 1

        while (left < right) {
            val pairSum = nums[left] + nums[right]
            when {
                pairSum == target -> return true
                pairSum > target -> right--
                else -> left++
            }
        }

        return false
    }

    // Time: O(n) Space: O(1)
    // Both Arrays needs to be sorted
    fun combineTwoSortedArrays(numsA: IntArray, numsB: IntArray) : IntArray {
        val result = IntArray(numsA.size + numsB.size)
        var resultIndex = 0
        var left = 0
        var right = 0

        while (left < numsA.size && right < numsB.size) {
            result[resultIndex++] = if (numsA[left] <= numsB[right]) {
                numsA[left++]
            } else {
                numsB[right++]
            }
        }

        while (left < numsA.size) {
            result[resultIndex++] = numsA[left++]
        }

        while (right < numsB.size) {
            result[resultIndex++] = numsB[right++]
        }

        return result
    }

    fun isFirstStringSubsequenceOfSecondString(firstString: String, secondString: String): Boolean {
        var firstIndex = 0
        var secondIndex = 0

        while (firstIndex < firstString.length && secondIndex < secondString.length) {
            if (firstString[firstIndex] == secondString[secondIndex]) {
                firstIndex++
            }
            secondIndex++
        }

        return firstIndex == firstString.length
    }

    fun reverseCharArray(chars: CharArray): CharArray {
        var left = 0
        var right = chars.size - 1

        while (left < right) {
            val temp = chars[left]
            chars[left] = chars[right]
            chars[right] = temp
            left++
            right--
        }

        return chars
    }

    fun reverseCharArrayRecursive(chars: CharArray): CharArray {
        var left = 0
        var right = chars.size - 1

        return reverseCharArrayImp(chars, left, right)
    }

    private fun reverseCharArrayImp(chars: CharArray, left: Int, right: Int): CharArray {
        if (left >= right) {
            return chars
        }

        val temp = chars[left]
        chars[left] = chars[right]
        chars[right] = temp

        return reverseCharArrayImp(chars, left + 1, right - 1)
    }

    fun moveZeroes(nums: IntArray): IntArray {
        var left = 0
        nums.forEach { num ->
            if (num != 0) {
                nums[left++] = num
            }
        }
        while (left < nums.size) {
            nums[left++] = 0
        }

        return nums
    }

    // Todo: Redo
    fun lazySortedSquares(array: IntArray): IntArray {
        for (i in array.indices) {
            array[i] = array[i] * array[i]
        }
        return array.sortedArray()
    }

    fun sortedSquares(array: IntArray): IntArray {
        var left = 0
        var right = array.size - 1
        val resultArray = IntArray(array.size)

        for (i in array.size -1 downTo 0) {
            // abs is key here since it returns the absolute value abs(value)
            val square = if (abs(array[left]) > abs(array[right])) {
                array[left++]
            } else {
                array[right--]
            }
            resultArray[i] = square * square
        }

        return resultArray
    }

}
