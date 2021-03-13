package problem.generateParentheses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val result = solution.generateParenthesis(3)
        assertThat(result).containsExactlyInAnyOrder(
            "((()))",
            "(()())",
            "(())()",
            "()(())",
            "()()()"
        )
    }

    @Test
    fun `test case 2`() {
        val result = solution.generateParenthesis(1)
        assertThat(result).containsExactlyInAnyOrder("()")
    }
}
