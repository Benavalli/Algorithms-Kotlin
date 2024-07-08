package arrays_strings.prefix_sum
import kotlin.math.max

class PrefixSum {

    // Pre - computing sum, each query is O(1)
    fun answerQueries(nums: IntArray, queries: Array<IntArray>, limit: Int): BooleanArray {
        val prefixSum = IntArray(nums.size)
        prefixSum[0] = nums[0]

        for (i in 1 until nums.size) {
            prefixSum[i] = prefixSum[i - 1] + nums[i]
        }

        val queriesResult = BooleanArray(queries.size)

        for (i in queries.indices) {
            val x = queries[i][0]
            val y = queries[i][1]
            val sum = prefixSum[y] - prefixSum[x] + nums[x]
            queriesResult[i] = sum < limit
        }

        return queriesResult
    }

    fun numbersOfWaysToSplitArrayFirstPartGreaterOrEqualSecond(nums: IntArray): Int {
        var secondSum = 0

        nums.forEach { num ->
            secondSum += num
        }

        var firsSum = 0
        var result = 0

        for (i in nums.indices - 1) {
            firsSum += nums[i]
            val difference = secondSum - firsSum
            if (firsSum >= difference) {
                result++
            }
        }

        return result
    }

    fun largestAltitude(gain: IntArray): Int {
        var alt = 0
        var result = 0

        for (i in gain.indices) {
            alt += gain[i]
            result = max(result, alt)
        }

        return result
    }
}