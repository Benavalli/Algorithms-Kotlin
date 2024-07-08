package sliding_window

class FixedWindow {

    fun arrayWindowLengthK(nums: IntArray, k: Int): IntArray {
        if (nums.size < k) {
            return nums
        }

        val windowSize = nums.size - k + 1
        val list = IntArray(windowSize)
        var sum = 0

        for (i in 0 until k) {
            sum += nums[i]
        }

        list[0] = sum / k

        for (i in k until nums.size) {
            sum += nums[i] - nums[i - k]
            list[i - k + 1] = sum / k
        }

        return list
    }
}