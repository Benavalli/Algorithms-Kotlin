package arrays_strings.three_pointers
import kotlin.math.abs

class ThreePointers {

    // Given an array arr[] of size n and an integer X. Find if there’s a triplet in the array which sums up to the given integer X.
    fun findTripletEqualTarget(nums: IntArray, target: Int): Boolean {
        // Let's sort the array, so we can apply the two pointers technic

        nums.sortedArray()

        for (i in nums.indices - 1) {
            var left = i + 1
            var right = nums.size - 1
            while (left < right) {
                val sum = nums[i] + nums[left] + nums[right]
                when {
                    sum == target -> return true
                    sum > target -> right--
                    else -> left ++
                }
            }
        }
        return false
    }

    // return all triplets that sum to zero without repeating values
    fun finAllTripletsThatSumEqualZero(nums: IntArray): List<List<Int>> {

        val arr = nums.sortedArray()
        val result = HashSet<List<Int>>()

        arr.forEach { print("$it ,")}
        println()

        for (i in 0 until arr.size - 1) {
            var j = i + 1
            var k = arr.size - 1

            while(j < k) {

                val sum = arr[i] + arr[j] + arr[k]
                when {
                    sum == 0 -> {
                        result.add(listOf(arr[i], arr[j], arr[k]))
                        j++
                        k--
                    }
                    sum > 0 -> k--
                    else -> j++
                }
            }
        }


        return result.toList()
    }

    fun threeSumClosest(nums: IntArray, target: Int): Int {

        var closest = Int.MAX_VALUE
        val sorted = nums.sortedArray()

        for (i in 0 until sorted.size - 1) {

            var j = i + 1
            var k = sorted.size - 1

            while (j < k) {

                val sum = sorted[i] + sorted[j] + sorted[k]

                if (abs(sum - target) < abs(closest - target)) {
                    closest = sum
                }

                when {
                    sum == target -> {
                        j++
                        k--
                    }
                    sum < target -> j++
                    else -> k--
                }

            }
        }

        return closest
    }

    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {

        val arr = nums.sortedArray()
        arr.forEach { print("$it, ") }
        println()
        val set = HashSet<List<Int>>()

        for (a in 0 until arr.size - 2) {
            for (b in a + 1 until arr.size - 1) {
                var c = b + 1
                var d = arr.size -1
                while (c < d) {
                    val sum = arr[a] + arr[b] + arr[c] + arr[d]

                    when {
                        sum == target -> {
                            println("a:$a, b:$b, c:$c, d:$d")
                            set.add(listOf(arr[a], arr[b], arr[c], arr[d]))
                            c++
                            d--
                        }
                        sum > target -> d--
                        else -> c++
                    }
                }
            }
        }

        return set.toList()
    }

}
