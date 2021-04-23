package problem.dp.problem368

import core.ISolution

/**
 * https://leetcode-cn.com/problems/largest-divisible-subset/
 * nums is sorted
 * dp[i]是表示nums[i] 为结尾的最长子集的长度
 * dp[0] = 1
 * dp[1] = if(nums[1]%nums[0] ==0) 2 else 1
 * dp[2] = max(while(dp[j] +1)) [0<=j < 2]
 */
class Solution : ISolution<IntArray, List<Int>> {
    private fun largestDivisibleSubset(nums: IntArray): List<Int> {
        if (nums.isEmpty()) return emptyList()
        if (nums.size == 1) return nums.asList()
        val dp = IntArray(nums.size) { 1 }
        nums.sort()
        dp[0] = 1
        var maxNum = -1
        var maxSize = -1
        for (i in 1 until nums.size) {
            for (j in 0 until i) {
                if (nums[i] % nums[j] == 0) dp[i] = maxOf(dp[i], dp[j] + 1)
            }
            if (maxSize <= dp[i]) {
                maxNum = nums[i]
                maxSize = dp[i]
            }
        }
        val result = mutableListOf<Int>()
        repeat(nums.size) {
            if (maxSize <= 0) return@repeat
            val index = nums.size - it - 1
            if (dp[index] == maxSize && maxNum % nums[index] == 0) {
                result.add(nums[index])
                maxSize--
                maxNum = nums[index]
            }
        }
        result.sort()
        return result
    }

    override fun run(input: IntArray): List<Int> = largestDivisibleSubset(input)
}
