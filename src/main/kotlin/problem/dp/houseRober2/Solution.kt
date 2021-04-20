package problem.dp.houseRober2

import core.ISolution

/**
 * https://leetcode-cn.com/problems/house-robber-ii/
 * 1. 第一间和最后一间不能同时窃取
 *
 * dp[0] = nums[0]
 * dp[1] = max(nums[0], nums[1])
 * dp[2] = max()
 */
class Solution : ISolution<IntArray, Int> {
    private fun rob(nums: IntArray): Int = when {
        nums.isEmpty() -> 0
        nums.size == 1 -> nums[0]
        nums.size == 2 -> maxOf(nums[0], nums[1])
        else -> maxOf(dp(nums.copyOfRange(0, nums.size - 1)), dp(nums.copyOfRange(1, nums.size)))
    }

    private fun dp(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums[0]
        val dp = IntArray(nums.size) { 0 }
        dp[0] = nums[0]
        dp[1] = maxOf(nums[0], nums[1])
        for (i in 2 until nums.size) {
            dp[i] = maxOf(dp[i - 2] + nums[i], dp[i - 1])
        }
        return dp[nums.size - 1]
    }

    override fun run(input: IntArray): Int = rob(input)
}
