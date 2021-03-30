package problem.medianOfTwoSortedArrays

/**
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
 * 你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？
 */
class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val numbers = nums1.size + nums2.size
        val medianIndex = (numbers / 2)
        var combinedNums = mutableListOf<Int>()
        when {
            nums1.isEmpty() -> combinedNums = nums2.toMutableList()
            nums2.isEmpty() -> combinedNums = nums1.toMutableList()
            else -> {
                var cursor1 = 0
                var cursor2 = 0
                while (cursor1 < nums1.size && cursor2 < nums2.size) {
                    if (nums1[cursor1] < nums2[cursor2]) {
                        combinedNums.add(nums1[cursor1++])
                    } else {
                        combinedNums.add(nums2[cursor2++])
                    }
                }
                while (cursor1 < nums1.size) {
                    combinedNums.add(nums1[cursor1++])
                }

                while (cursor2 < nums2.size) {
                    combinedNums.add(nums2[cursor2++])
                }
            }
        }
        return if (numbers % 2 == 1) combinedNums[medianIndex].toDouble() else
            (combinedNums[medianIndex] + combinedNums[medianIndex - 1]).toDouble() / 2
    }

    // 二分查找法
    // find k th
    fun findMedianSortedArraysV1(nums1: IntArray, nums2: IntArray): Double {
        val leftK = (nums1.size + nums2.size + 1) / 2
        val rightK = (nums1.size + nums2.size + 2) / 2
        return (binarySearch(nums1, nums2, leftK) + binarySearch(nums1, nums2, rightK)).toDouble() / 2
    }

    private fun binarySearch(
        nums1: IntArray,
        nums2: IntArray,
        k: Int
    ): Int {
        // recursion out
        if (nums1.isEmpty()) return nums2[k - 1]
        if (nums2.isEmpty()) return nums1[k - 1]

        if (k == 1) return nums1[0].coerceAtMost(nums2[0])

        val nums1Index = nums1.size.coerceAtMost(k / 2) - 1
        val nums2Index = nums2.size.coerceAtMost(k / 2) - 1
        return if (nums1[nums1Index] < nums2[nums2Index]) binarySearch(
            nums1.copyOfRange(nums1Index + 1, nums1.size),
            nums2,
            k - (nums1Index + 1)
        )
        else binarySearch(
            nums1,
            nums2.copyOfRange(nums2Index + 1, nums2.size),
            k - (nums2Index + 1)
        )
    }
}
