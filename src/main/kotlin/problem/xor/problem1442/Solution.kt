package problem.xor.problem1442

import core.ISolution

/**
 * https://leetcode-cn.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
 * a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
 * b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
 */
internal class Solution : ISolution<IntArray, Int> {
    override fun run(input: IntArray): Int = countTriplets(input)

    private fun countTriplets(nums: IntArray): Int {
        if (nums.size < 3) return 0
        val helpers = IntArray(nums.size + 1) { nums[0] }.apply {
            repeat(nums.size) { this[it + 1] = this[it].xor(nums[it]) }
        }
        var result = 0
        for (i in nums.indices) {
            for (k in i + 1 until nums.size) {
                if (helpers[i] == helpers[k + 1]) result += k - i
            }
        }
        return result
    }
}
