package problem.spiralMatrix

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val result = solution.spiralOrder(matrix)
        assertThat(result).isEqualTo(listOf(1, 2, 3, 6, 9, 8, 7, 4, 5))
    }

    @Test
    fun `test case 2`() {
        val matrix = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))
        val result = solution.spiralOrder(matrix)
        assertThat(result).isEqualTo(listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7))
    }

    @Test
    fun `test case 3`() {
        val matrix = arrayOf(intArrayOf(3), intArrayOf(2))
        val result = solution.spiralOrder(matrix)
        assertThat(result).isEqualTo(listOf(3, 2))
    }
}
