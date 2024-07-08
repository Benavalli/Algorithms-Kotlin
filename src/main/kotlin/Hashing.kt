import kotlin.math.max
class Hashing {



    //eceba
    fun maxCharacterOccurrence(word: String, k: Int): Int {
        val hashCount = HashMap<Char, Int>()
        var left = 0
        var result = 0

        for (i in word.indices) {
            val char = word[i]
            hashCount[char] = hashCount.getOrDefault(char, 0) + 1
            while (hashCount.size < k) {
                val remove = word[left]
                hashCount[remove] = hashCount.getOrDefault(remove, 0) - 1
                if(hashCount[remove] == 0) {
                    hashCount.remove(remove)
                }
                left++
            }
            result = max(result, i - left + 1)
        }

        return result
    }

    fun findCommonNumbers(matrix: Array<IntArray>): IntArray {
        val numbersFrequency = HashMap<Int, Int>()
        for (array in matrix) {
            for (i in array.indices) {
                val num = array[i]
                numbersFrequency[num] = numbersFrequency.getOrDefault(num, 0) + 1
            }
        }
        val resultArray = mutableListOf<Int>()
        numbersFrequency.forEach { (key, value) ->
            if (value == matrix.size) {
                resultArray.add(key)
            }
        }
        return resultArray.sorted().toIntArray()
    }

    fun allCharactersSameFrequency(word: String): Boolean {
        val hashMap = HashMap<Char, Int>()
        for (i in word.indices) {
            val char = word[i]
            hashMap[char] = hashMap.getOrDefault(char, 0) + 1
        }
        val set = hashMap.values.toSet()
        return set.size == 1
    }

    // nums can have negative numbers, also the sum need to be EQUAL than K
    fun numberOfSubArraysSumEqualToK(nums: IntArray, k: Int): Int {
        var result = 0
        var prefix = 0
        val prefixMap = HashMap<Int, Int>()
        prefixMap[0] = 1

        val map = mutableMapOf(
            'b' to 1,
            'a' to 1,
            'l' to 2,
            'a' to 2,
            'n' to 1
        )

        for (i in nums.indices) {
            prefix += nums[i]
            result += prefixMap.getOrDefault(prefix - k, 0)
            prefixMap[prefix] = prefixMap.getOrDefault(prefix, 0) + 1
        }

        return result
    }
}
