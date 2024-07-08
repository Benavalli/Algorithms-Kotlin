package hashing.checking_existence

class CheckingExistence {

    // Can not use the same index twice
    fun givenUnsortedIntegerArrayGetPairsThatSumEqualTarget(nums: IntArray, target: Int): Array<IntArray> {
        val map = HashMap<Int, Int>()
        val result = mutableListOf<IntArray>()

        for (i in nums.indices) {
            val num = nums[i]
            val difference = target - num
            if (map.containsKey(difference)) {
                map[difference]?.let { index ->
                    result.add(intArrayOf(index, i))
                }
            }

            map[num] = i
        }

        return result.toTypedArray()
    }

    fun returnFirstCharThatAppearTwice(s: String): Char? {
        val set = HashSet<Char>()
        for (i in s.indices) {
            val char = s[i]
            if (set.contains(char)) {
                return char
            }
            set.add(char)
        }

        return null
    }

    fun missingNumber(nums: IntArray): Int {
        val set = HashSet<Int>()
        for (i in nums.indices) {
            set.add(nums[i])
        }

        for (i in 0..nums.size) {
            if (!set.contains(i)) {
                return i
            }
        }

        return -1
    }
}