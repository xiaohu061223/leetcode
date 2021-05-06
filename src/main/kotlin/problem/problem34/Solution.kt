package problem.problem34

import core.ISolution

/**
 * https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
class Solution : ISolution<Pair<IntArray, Int>, IntArray> {
    override fun run(input: Pair<IntArray, Int>): IntArray {
        return searchRange(input.first, input.second)
    }

    private fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty() || nums.first() > target || nums.last() < target) return intArrayOf(-1, -1)
        return binarySearch(nums, 0, nums.size, target)
    }

    private fun binarySearch(nums: IntArray, left: Int, right: Int, target: Int): IntArray {
        val mid = left + (right - left) / 2
        return when {
            left > right -> intArrayOf(-1, -1)
            nums[mid] == target -> {
                var leftTarget = mid
                var rightTarget = mid
                while (leftTarget >= 0 && nums[leftTarget] == target) leftTarget--
                while (rightTarget < nums.size && nums[rightTarget] == target) rightTarget++
                intArrayOf(leftTarget + 1, rightTarget - 1)
            }
            nums[mid] < target -> binarySearch(nums, mid + 1, right, target)
            nums[mid] > target -> binarySearch(nums, left, mid - 1, target)
            else -> intArrayOf(-1, -1)
        }

    }
}
