package problem.dp.houseRobber

import core.ISolution

/**
 * https://leetcode-cn.com/problems/house-robber/
 *
 *  dp[0] = nums[0]
 *  dp[1] = max(nums[0], nums[1])
 *  .
 *  ..
 *  ...
 *  dp[i] = max(dp[i-2]+nums[i], dp[i-1])
 */
class Solution : ISolution<IntArray, Int> {
    private fun rob(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums.first()
        val dp = IntArray(nums.size) { 0 }
        dp[0] = nums.first()
        dp[1] = maxOf(nums[0], nums[1])
        for (i in 2 until nums.size) {
            dp[i] = maxOf(dp[i - 2] + nums[i], dp[i - 1])
        }
        return dp[nums.size - 1]
    }

    override fun run(input: IntArray): Int = rob(input)
}
