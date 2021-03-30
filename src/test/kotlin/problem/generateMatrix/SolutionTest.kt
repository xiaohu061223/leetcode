package problem.generateMatrix

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val result = solution.generateMatrix(1)
        assertThat(result).isEqualTo(arrayOf(intArrayOf(1)))
    }

    @Test
    fun `test case 2`() {
        val result = solution.generateMatrix(2)
        assertThat(result).isEqualTo(arrayOf(intArrayOf(1, 2), intArrayOf(4, 3)))
    }

    @Test
    fun `test case 3`() {
        val result = solution.generateMatrix(3)
        assertThat(result).isEqualTo(
            arrayOf(
                intArrayOf(1, 2, 3),
                intArrayOf(8, 9, 4),
                intArrayOf(7, 6, 5)
            )
        )
    }
}
