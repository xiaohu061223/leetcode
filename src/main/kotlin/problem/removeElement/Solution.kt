package problem.removeElement

import core.ISolution

/**
 * https://leetcode-cn.com/problems/remove-element/
 */
class Solution : ISolution<Pair<IntArray, Int>, Int> {
    private fun removeElement(nums: IntArray, `val`: Int): Int {
        var pointer = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[pointer++] = nums[i]
            }
        }
        for (i in pointer until nums.size) {
            nums[i] = 0
        }
        return pointer
    }

    override fun run(input: Pair<IntArray, Int>): Int {
        return removeElement(input.first, input.second)
    }
}
