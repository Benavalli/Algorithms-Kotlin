package hashing.couting
import kotlin.math.max

class Counting {

    fun longestSubstringWithKRepeatedNumberOfCharacters(s: String, k: Int): Int {
        var left = 0
        val map = HashMap<Char, Int>()
        var result = 0

        for (i in s.indices) {
            val char = s[i]
            map[char] = map.getOrDefault(char, 0) + 1

            while (map.size > k) {
                val removal = s[left++]
                map[removal] = map.getOrDefault(removal, 0) - 1
                if (map[removal] == 0) {
                    map.remove(removal)
                }
            }

            result = max(result, i - left + 1)
        }

        return result
    }

    fun numJewelsInStones(jewels: String, stones: String): Int {
        val set = HashSet<Char>()
        var count = 0

        jewels.forEach { set.add(it) }

        stones.forEach { stone ->
            if (set.contains(stone)) {
                count++
            }
        }

        return count
    }

    // check if first string can be built based on the second string
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val ransomMap = HashMap<Char, Int>()
        val magazineMap = HashMap<Char, Int>()

        ransomNote.forEach { ransomMap[it] = ransomMap.getOrDefault(it, 0) + 1 }
        magazine.forEach { magazineMap[it] = magazineMap.getOrDefault(it, 0) + 1 }

        ransomMap.forEach { (rKey, rValue) ->
            if (magazineMap.containsKey(rKey)) {
                magazineMap[rKey]?.let { mValue ->
                    if (mValue < rValue) {
                        return false
                    }
                }
            } else {
                return false
            }
        }

        return true
    }

    // Find sub arrays with EXACTLY matching condition
    fun returnNumberSubArraysWithSumExactlyEqualK(nums: IntArray, target: Int): Int {
        val map = HashMap<Int, Int>()
        map[0] = 1
        var sum = 0
        var result = 0

        for (i in nums.indices) {
            sum += nums[i]
            val diff = sum - target
            result += map.getOrDefault(diff, 0)
            map[sum] = map.getOrDefault(sum, 0) + 1
        }

        return result
    }

    fun returnNumberSubArraysWithExactlyNumberOfOddNumbers(nums: IntArray, k: Int): Int {
        val map = HashMap<Int, Int>()
        map[0] = 1
        var sum = 0
        var result = 0

        for (i in nums.indices) {
            sum += nums[i] % 2
            val diff = sum - k
            result += map.getOrDefault(diff, 0)
            map[sum] = map.getOrDefault(sum, 0) + 1
        }

        return result
    }
}