package problem.longestPalindromicSubstring

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SolutionTest {

    @Test
    fun `test case 1`() {
        val testString = "babad"
        val result = Solution().longestPalindrome(testString)
        assertEquals(result, "bab")
    }

    @Test
    fun `test case 2`() {
        val testString = "cbbd"
        val result = Solution().longestPalindrome(testString)
        assertEquals(result, "bb")
    }

    @Test
    fun `test case 3`() {
        val testString = "a"
        val result = Solution().longestPalindrome(testString)
        assertEquals(result, "a")
    }

    @Test
    fun `test case 4`() {
        val testString = "ac"
        val result = Solution().longestPalindrome(testString)
        assertEquals(result, "a")
    }
}
