package problem.findMinimumInRotatedSortedArray2

import core.ISolution

class Solution : ISolution<IntArray, Int> {
    private fun findMin(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] < nums[right] -> right = mid
                nums[mid] > nums[right] -> left = mid + 1
                else -> right--
            }
        }
        return nums[left]
    }

    override fun run(input: IntArray): Int = findMin(input)
}
