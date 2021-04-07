package problem.searchInRotatedSortedArrary

import core.ISolution

class Solution : ISolution<Pair<IntArray, Int>, Int> {
    private fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) return -1
        if (nums.size == 1) return if (nums[0] == target) 0 else -1
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            when {
                nums[mid] == target -> return mid
                nums[0] <= nums[mid] -> if (nums[0] <= target && target < nums[mid]) right = mid - 1 else left = mid + 1
                else -> if (nums[mid] < target && target <= nums.last()) left = mid + 1 else right = mid - 1
            }
        }
        return -1
    }

    override fun run(input: Pair<IntArray, Int>): Int = search(input.first, input.second)
}


