package threeSum

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3) return emptyList()
        val sortedNums = nums.sorted()
        val result = mutableListOf<List<Int>>()
        for (index in sortedNums.indices) {
            if (sortedNums[index] > 0) return result
            if (index > 0 && sortedNums[index] == sortedNums[index - 1]) continue
            var left = index + 1
            var right = sortedNums.size - 1
            while (left < right) {
                val threeSum = sortedNums[index] + sortedNums[left] + sortedNums[right]
                when {
                    threeSum == 0 -> {
                        result.add(listOf(sortedNums[index], sortedNums[left], sortedNums[right]))
                        while (left < right && sortedNums[left] == sortedNums[left + 1]) left++
                        while (left < right && sortedNums[right] == sortedNums[right - 1]) right--
                        left++
                        right--
                    }
                    threeSum > 0 -> right--
                    else -> left++
                }
            }
        }
        return result
    }
}
