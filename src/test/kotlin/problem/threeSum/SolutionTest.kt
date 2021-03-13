package problem.threeSum

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
        val result = solution.threeSum(nums)
        assertEquals(2, result.size)
        assertEquals(-1, result[0][0])
    }

    @Test
    fun `test case 2`() {
        val nums = intArrayOf()
        val result = solution.threeSum(nums)
        assertEquals(0, result.size)
    }

    @Test
    fun `test case 3`() {
        val nums = intArrayOf(0)
        val result = solution.threeSum(nums)
        assertEquals(0, result.size)
    }
}
