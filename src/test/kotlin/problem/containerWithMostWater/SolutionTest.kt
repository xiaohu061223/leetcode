package problem.containerWithMostWater

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val height = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
        assertEquals(49, solution.maxArea(height))
    }

    @Test
    fun `test case 2`() {
        val height = intArrayOf(1, 1)
        assertEquals(1, solution.maxArea(height))
    }

    @Test
    fun `test case 3`() {
        val height = intArrayOf(4, 3, 2, 1, 4)
        assertEquals(16, solution.maxArea(height))
    }

    @Test
    fun `test case 4`() {
        val height = intArrayOf(1, 2, 1)
        assertEquals(2, solution.maxArea(height))
    }
}
