package problem.twoSum

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 */
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>() // <numbers, index>
        for ((index, number) in nums.withIndex()) {
            map[target - number]?.run { return intArrayOf(this, index) }
            map[nums[index]] = index
        }
        return intArrayOf()
    }
}
