package problem.findMinimumInRotatedSortedArray

import core.ISolution

class Solution1 : ISolution<IntArray, Int> {
    private fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (nums[mid] <= nums[right]) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return nums[left]
    }

    override fun run(input: IntArray): Int = findMin(input)
}
