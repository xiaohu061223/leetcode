package problem.findMinimumInRotatedSortedArray

import core.ISolution

class Solution : ISolution<IntArray, Int> {
    private fun findMin(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        var left = 0
        var right = nums.size - 1
        if (nums.first() < nums.last()) return nums.first()

        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[left] > nums[right]) {
                if (nums[mid] >= nums[right]) {
                    left = mid + 1
                } else {
                    right = mid
                }
            } else {
                right = mid - 1
            }
        }
        return nums[left]
    }

    override fun run(input: IntArray): Int = findMin(input)
}
