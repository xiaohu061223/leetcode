package problem.longestSubstringWithoutRepeatingCharacters

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun `test case 1`() {
        val s = "abcabcbb"
        val result = Solution().lengthOfLongestSubstring(s)
        assertEquals(3, result)
    }

    @Test
    fun `test case 2`() {
        val s = "bbbbb"
        val result = Solution().lengthOfLongestSubstring(s)
        assertEquals(1, result)
    }

    @Test
    fun `test case 3`() {
        val s = "pwwkew"
        val result = Solution().lengthOfLongestSubstring(s)
        assertEquals(3, result)
    }

    @Test
    fun `test case 4`() {
        val s = ""
        val result = Solution().lengthOfLongestSubstring(s)
        assertEquals(0, result)
    }

    @Test
    fun `test case 5`() {
        val s = "au"
        val result = Solution().lengthOfLongestSubstring(s)
        assertEquals(2, result)
    }

    @Test
    fun `test case 6`() {
        val s = "dvdf"
        val result = Solution().lengthOfLongestSubstring(s)
        assertEquals(3, result)
    }
}
