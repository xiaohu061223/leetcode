package validParentheses

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val s = "()"
        assertTrue(solution.isValid(s))
    }

    @Test
    fun `test case 2`() {
        val s = "()[]{}"
        assertTrue(solution.isValid(s))
    }

    @Test
    fun `test case 3`() {
        val s = "(]"
        assertFalse(solution.isValid(s))
    }

    @Test
    fun `test case 4`() {
        val s = "([)]"
        assertFalse(solution.isValid(s))
    }

    @Test
    fun `test case 5`() {
        val s = "{[]}"
        assertTrue(solution.isValid(s))
    }
}
