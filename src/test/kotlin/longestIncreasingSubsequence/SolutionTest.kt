package longestIncreasingSubsequence

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val nums = intArrayOf(10, 9, 2, 5, 3, 7, 101, 18)
        val result = solution.lengthOfLIS(nums)
        assertEquals(4, result)
    }

    @Test
    fun `test case 2`() {
        val nums = intArrayOf(0, 1, 0, 3, 2, 3)
        val result = solution.lengthOfLIS(nums)
        assertEquals(4, result)
    }

    @Test
    fun `test case 3`() {
        val nums = intArrayOf(7, 7, 7, 7, 7, 7)
        val result = solution.lengthOfLIS(nums)
        assertEquals(1, result)
    }
}
