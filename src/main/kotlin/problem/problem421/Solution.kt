package problem.problem421

import core.ISolution

/**
 * https://leetcode-cn.com/problems/maximum-xor-of-two-numbers-in-an-array/
 */
class Solution : ISolution<IntArray, Int> {
    override fun run(input: IntArray): Int {
        return findMaximumXOR(input)
    }

    private fun findMaximumXOR(nums: IntArray): Int {
        if (nums.isEmpty()) return -1
        if (nums.size == 1) return nums[0].xor(nums[0])
        val initValue = nums[0]
        val maxValue = 0
        repeat(nums.size - 1) {
        }
        return 0
    }
}
