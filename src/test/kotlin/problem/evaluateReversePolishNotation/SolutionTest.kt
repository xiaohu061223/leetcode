package problem.evaluateReversePolishNotation

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val result = solution.evalRPN(arrayOf("2", "1", "+", "3", "*"))
        assertThat(result).isEqualTo(9)
    }

    @Test
    fun `test case 2`() {
        val result = solution.evalRPN(arrayOf("4", "13", "5", "/", "+"))
        assertThat(result).isEqualTo(6)
    }

    @Test
    fun `test case 3`() {
        val result = solution.evalRPN(
            arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"),
        )
        assertThat(result).isEqualTo(22)
    }
}
