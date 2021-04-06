package problem.removeDuplicatesFromSortedArray2

import core.ISolution

class Solution : ISolution<IntArray, Int> {
    override fun run(input: IntArray): Int = removeDuplicates(input)

    private fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var realIndex = 0
        var currentValue = nums.first()
        var isDuplicate = false
        for (i in 1 until nums.size) {
            if (currentValue != nums[i]) {
                realIndex++
                currentValue = nums[i]
                isDuplicate = false
                nums[realIndex] = nums[i]
            } else if (currentValue == nums[i] && !isDuplicate) {
                realIndex++
                currentValue = nums[i]
                isDuplicate = true
                nums[realIndex] = nums[i]
            }
        }
        return realIndex + 1
    }
}
