package nextGreaterElement2

/**
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。
 * 数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
 */
class Solution {
    fun nextGreaterElements(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()
        nums.forEachIndexed { index, value ->
            result.add(findNextGreater(nums, value, index))
        }
        return result.toIntArray()
    }

    private fun findNextGreater(nums: IntArray, target: Int, index: Int): Int {
        var current = index + 1
        var count = 0
        while (count < nums.size) {
            if (current >= nums.size) current = 0
            if (nums[current] > target) return nums[current]
            current++
            count++
        }
        return -1
    }

    /*stack version*/
    fun nextGreaterElementsV1(nums: IntArray): IntArray {
        val result = IntArray(nums.size) { i -> -1 }
        val stack = mutableListOf<Int>()
        for (i in 0 until nums.size * 2) {
            while (stack.isNotEmpty() && nums[stack.last()] < nums[i % nums.size]) {
                result[stack.last()] = nums[i % nums.size]
                stack.removeLast()
            }
            stack.add(i % nums.size)
        }
        return result
    }
}
