package problem.problem1011

import core.ISolution
import kotlin.math.min

/**
 * https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/
 */
class Solution : ISolution<Pair<IntArray, Int>, Int> {
    private fun shipWithinDays(weight: IntArray, D: Int): Int {
        var left = weight.max() ?: return 0
        var right = weight.sum()
        var minResult = Int.MAX_VALUE
        while (left <= right) {
            val mid = (right - left) / 2 + left
            if (check(weight, D, mid)) {
                minResult = min(minResult, mid)
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return minResult
    }

    fun check(nums: IntArray, D: Int, target: Int): Boolean {
        var current = 0
        var remainDays = D
        nums.forEach {
            current += it
            if (current > target) {
                remainDays--
                current = it
                if (remainDays <= 0) return false
            }
        }
        return true
    }

    override fun run(input: Pair<IntArray, Int>): Int {
        return shipWithinDays(input.first, input.second)
    }
}

fun main() {
    print(Solution().check(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5, 15))
}
