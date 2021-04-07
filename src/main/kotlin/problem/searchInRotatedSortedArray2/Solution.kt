package problem.searchInRotatedSortedArray2

import core.ISolution

/**
 * https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/
 */
class Solution : ISolution<Pair<IntArray, Int>, Boolean> {
    private fun search(nums: IntArray, target: Int): Boolean {
        if (nums.isEmpty()) return false
        if (nums.size == 1) return nums[0] == target

        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) return true
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++
                right--
            } else {
                if (nums[left] <= nums[mid]) {
                    if (nums[left] <= target && target <= nums[mid]) right = mid - 1 else left = mid + 1
                } else {
                    if (nums[mid] < target && target <= nums.last()) left = mid + 1 else right = mid - 1
                }
            }
        }
        return false
    }

    override fun run(input: Pair<IntArray, Int>): Boolean = search(input.first, input.second)
}
