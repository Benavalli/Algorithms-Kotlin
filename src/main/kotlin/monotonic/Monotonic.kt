package monotonic

import java.util.*

class Monotonic {

    fun dayToWaitTillWarmerDay(days: IntArray): IntArray {
        val stack = Stack<Int>()
        val warmerDays = IntArray(days.size)

        for (i in days.indices) {
            val day = days[i]
            while (stack.isNotEmpty() && days[stack.peek()] < day)  {
                val j = stack.pop()
                warmerDays[j] = i - j
            }
            stack.push(i)
        }

        return warmerDays
    }

}