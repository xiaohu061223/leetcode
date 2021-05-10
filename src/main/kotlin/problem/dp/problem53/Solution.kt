package problem.dp.problem53

import common.log
import core.ISolution

/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 * dp[0] = nums[0]
 * dp[i] = max(dp[i-1]+nums[i], nums[i])
 */
class Solution : ISolution<IntArray, Int> {

    override fun run(input: IntArray): Int {
        return maxSubArray(input)
    }

    private fun maxSubArray(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return nums.first()
        val dp = IntArray(nums.size) { Int.MIN_VALUE }
        dp[0] = nums.first()
        for (i in 1 until nums.size) {
            dp[i] = if (dp[i - 1] >= 0) (dp[i - 1] + nums[i]) else nums[i]
//            equals to
//            dp[i] = maxOf(dp[i-1] +nums[i], nums[i])
        }
        dp.log()
        return dp.maxOrNull() ?: 0
    }
}
