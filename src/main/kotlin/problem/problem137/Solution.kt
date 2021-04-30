package problem.problem137

import core.ISolution

/**
 * https://leetcode-cn.com/problems/single-number-ii/
 */
class Solution : ISolution<IntArray, Int> {
    private fun singleNumber(nums: IntArray): Int {
        return nums.groupBy { it }.filter { it.value.size == 1 }.keys.first()
    }

    override fun run(input: IntArray): Int = singleNumber(input)
}
