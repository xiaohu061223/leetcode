package problem.nextPermutation

import core.ISolution

/**
 * https://leetcode-cn.com/problems/next-permutation/
 */
class Solution : ISolution<IntArray, IntArray> {
    private fun nextPermutation(nums: IntArray): IntArray {
        if (nums.isEmpty() || nums.size == 1) return nums
        for (i in nums.size - 2 downTo 0 step 1) {
            when {
                i == 0 && nums[i] >= nums[i + 1] -> {
                    reverse(nums, i, nums.size)
                }
                nums[i] < nums[i + 1] -> {
                    val firstNextBig = firstNextBig(nums, i + 1, nums.size, nums[i])
                    swap(nums, i, firstNextBig)
                    reverse(nums, i + 1, nums.size)
                    break
                }
            }
        }
        return nums
    }

    private fun swap(nums: IntArray, value1: Int, value2: Int) {
        val tmp = nums[value1]
        nums[value1] = nums[value2]
        nums[value2] = tmp
    }

    private fun firstNextBig(nums: IntArray, start: Int, end: Int, target: Int): Int {
        var minIndex = start
        for (i in start until end) {
            if (target < nums[i] && nums[i] <= nums[minIndex]) minIndex = i
        }
        return minIndex
    }

    private fun reverse(nums: IntArray, start: Int, end: Int): Unit = if (start < end - 1) {
        swap(nums, start, end - 1)
        reverse(nums, start + 1, end - 1)
    } else Unit

    override fun run(input: IntArray): IntArray = nextPermutation(input)
}
