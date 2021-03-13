package problem.longestIncreasingSubsequence

/**
 * 给你一个整数数组 nums ，找到其中最长严格递增子序列的长度。
 * 子序列是由数组派生而来的序列，删除（或不删除）数组中的元素而不改变其余元素的顺序。例如，[3,6,2,7] 是数组 [0,3,1,6,2,2,7] 的子序列。
 */
class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        return recursion(nums, intArrayOf(nums[0]))
    }

    private fun recursion(nums: IntArray, increasingNums: IntArray): Int {
        return when (nums.size) {
            0 -> increasingNums.size
            1 -> if (increasingNums.last() < nums[0]) increasingNums.size + 1 else increasingNums.size
            else -> {
                if (nums[0] > increasingNums.last()) {
                    recursion(nums.copyOfRange(1, nums.size), increasingNums.plus(nums[0]))
                } else {
                    val newIncreasingNums = findAndReplace(increasingNums, nums[0])
                    recursion(nums.copyOfRange(1, nums.size), newIncreasingNums)
                }
            }
        }
    }

    // refactor
    private fun findAndReplace(nums: IntArray, target: Int): IntArray {
        if (nums[0] >= target) return intArrayOf(target) + nums.copyOfRange(1, nums.size)
        nums.forEachIndexed { index: Int, i: Int ->
            if (target <= i) return nums.copyOfRange(0, index).plus(target) + nums.copyOfRange(index + 1, nums.size)
        }
        return nums
    }
}
