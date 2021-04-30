package problem.problem137

import core.ISolution

/**
 * https://leetcode-cn.com/problems/single-number-ii/
 */
class Solution : ISolution<IntArray, Int> {
    private fun singleNumber(nums: IntArray): Int {
        return nums.groupBy { value -> value to nums.filter { it == value }.size }.keys.first { it.second == 1 }.first
    }

    override fun run(input: IntArray): Int = singleNumber(input)
}
