package arrays_strings.two_pointers
import kotlin.math.max

class SlidingWindow {

    // SubArray problems find maximum or best or longest
    // Time: O(n) Space: O(1)
    fun maximumSubArraySizeLessOrEqualTarget(nums: IntArray, target: Int): Int {
        var left = 0
        var sum = 0
        var maxSize = 0

        for (right in nums.indices) {
            sum += nums[right]
            while (sum > target) {
                sum -= nums[left++]
            }
            maxSize = max(maxSize, right - left + 1)
        }

        return maxSize
    }
}