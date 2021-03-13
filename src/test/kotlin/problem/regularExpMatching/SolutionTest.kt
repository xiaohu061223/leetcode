package problem.regularExpMatching

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val s = "aa"
        val p = "a"
        assertFalse(solution.isMatch(s, p))
    }

    @Test
    fun `test case 2`() {
        val s = "aaa"
        val p = "a*a"
        assertTrue(solution.isMatch(s, p))
    }

    @Test
    fun `test case 3`() {
        val s = "ab"
        val p = ".*"
        assertTrue(solution.isMatch(s, p))
    }

    @Test
    fun `test case 4`() {
        val s = "aab"
        val p = "c*a*b"
        assertTrue(solution.isMatch(s, p))
    }

    @Test
    fun `test case 5`() {
        val s = "mississppi"
        val p = "mis*is*p*"
        assertFalse(solution.isMatch(s, p))
    }

    @Test
    fun `test case 6`() {
        val s = "ab"
        val p = ".*c"
        assertFalse(solution.isMatch(s, p))
    }

    @Test
    fun `test case 7`() {
        val s = "aaaa"
        val p = "aaaaa"
        assertFalse(solution.isMatch(s, p))
    }

    @Test
    fun `test case 8`() {
        val s = "aaa"
        val p = "ab*a*c*a"
        assertTrue(solution.isMatch(s, p))
    }
}
