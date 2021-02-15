package medianOfTwoSortedArrays

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    @Test
    fun `test case 1`() {
        val nums1 = intArrayOf(1, 3)
        val nums2 = intArrayOf(2)
        val result = Solution().findMedianSortedArrays(nums1, nums2)
        assertEquals(2.0, result)
    }

    @Test
    fun `test case 2`() {
        val nums1 = intArrayOf(1, 2)
        val nums2 = intArrayOf(3, 4)
        val result = Solution().findMedianSortedArrays(nums1, nums2)
        assertEquals(2.5, result)
    }

    @Test
    fun `test case 3`() {
        val nums1 = intArrayOf(0, 0)
        val nums2 = intArrayOf(0, 0)
        val result = Solution().findMedianSortedArrays(nums1, nums2)
        assertEquals(0.0, result)
    }

    @Test
    fun `test case 4`() {
        val nums1 = intArrayOf()
        val nums2 = intArrayOf(1)
        val result = Solution().findMedianSortedArrays(nums1, nums2)
        assertEquals(1.0, result)
    }

    @Test
    fun `test case 5`() {
        val nums1 = intArrayOf(2)
        val nums2 = intArrayOf()
        val result = Solution().findMedianSortedArrays(nums1, nums2)
        assertEquals(2.0, result)
    }
}
