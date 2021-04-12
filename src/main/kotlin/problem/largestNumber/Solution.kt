package problem.largestNumber

import core.ISolution

/**
 * https://leetcode-cn.com/problems/largest-number/
 * 1<=nums.length<=100
 * 0<=nums[i]<=10^9
 */
class Solution : ISolution<IntArray, String> {
    override fun run(input: IntArray): String = largestNumber(input)

    private fun largestNumber(nums: IntArray): String {
        return nums.sortedWith(
            java.util.Comparator { a, b ->
                ("$b$a".toLong() - "$a$b".toLong()).toInt()
            }
        ).takeIf { it[0] != 0 }?.joinToString("") ?: "0"
    }
}
