package problem.palindromePartitioning2

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val result = solution.minCut("aab")
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `test case 2`() {
        val result = solution.minCut("a")
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `test case 3`() {
        val result = solution.minCut("ab")
        assertThat(result).isEqualTo(1)
    }
}
