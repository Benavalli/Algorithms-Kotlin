package arrays_strings.sliding_window
import kotlin.math.max

class SlidingWindow {

    // SubArray problems find maximum or best or longest
    // Time: O(n) Space: O(1)
    fun maximumSubArraySizeLessOrEqualTarget(nums: IntArray, target: Int): Int {
        var left = 0
        var max = 0
        var sum = 0
        for (right in nums.indices) {
            sum += nums[right]
            while (sum > target) {
                sum -= nums[left++]
            }
            max = max(max, right - left + 1)
        }

        return max
    }

    fun maximumSubArraySizeLessOrEqualTargetReturningArray(array: IntArray, target: Int): IntArray {
        var left = 0
        var currentSum = 0
        var maxLength = 0
        var subArray = intArrayOf()

        for (i in array.indices) {
            currentSum += array[i]
            while (currentSum > target) {
                currentSum -= array[left++]
            }
            val subArraySize = i - left + 1
            if (subArraySize > maxLength) {
                maxLength = subArraySize
                subArray = array.copyOfRange(left, i + 1)
            }
        }

        return subArray
    }

    fun longestBinarySubstringHavingOnlyOneZeroThaCanBeFlipped(binaryString: String): Int {
        var left = 0
        var count = 0
        var maxSize = 0

        for (right in binaryString.indices ) {
            if (binaryString[right] == '0') {
                count++
            }
            while (count > 1) {
                if (binaryString[left++] == '0') {
                    count--
                }
            }

            maxSize = max(maxSize, right - left + 1)
        }

        return maxSize
    }

    fun numberOfSubArraysProductLessThanTarget(nums: IntArray, target: Int): Int {
        var left = 0
        var product = 1
        var count = 0

        for (right in nums.indices) {
            product *= nums[right]
            while (product >= target) {
                product /= nums[left++]
            }
            count += right - left + 1
        }

        return count
    }

    fun maxSumFixedWindow(nums: IntArray, windowSize: Int): Int {
        var sum = 0

        for (i in 0 until windowSize) {
            sum += nums[i]
        }

        var result = sum

        for (i in windowSize until nums.size) {
            sum += nums[i] - nums[i - windowSize]
            result = max(result, sum)
        }

        return result
    }

    fun maxVowels(s: String, k: Int): Int {

        val set = setOf('a', 'e', 'i', 'o', 'u')
        var count = 0

        if (s.length < k) {
            return 0
        }

        for (i in 0 until k) {
            val char = s[i]
            if (set.contains(char)) {
                count++
            }
        }

        var result = count

        for ((left, i) in (k until s.length).withIndex()) {
            val char = s[i]

            if (set.contains(char)) {
                count++
            }

            val obsoleteChar = s[left]

            if (set.contains(obsoleteChar)) {
                count--
            }

            result = max(result, count)
        }

        return result
    }

}