package problem.dp.problem303

/**
 * https://leetcode-cn.com/problems/range-sum-query-immutable/
 *
 * dp[0] = 0
 * dp[1] = nums[0]
 * dp[i] = dp[i-1]+nums[i-1]
 */
class NumArray(
    nums: IntArray,
) {
    val dp: IntArray = IntArray(nums.size + 1) { 0 }

    init {
        dp[0] = 0
        dp[1] = nums.first()
        for (i in 2 until nums.size + 1) {
            dp[i] = dp[i - 1] + nums[i - 1]
        }
    }

    fun sumRange(left: Int, right: Int): Int = dp[right + 1] - dp[left]
}
