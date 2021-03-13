package problem.letterCombinationsOfAPhoneNumber

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val digits = "23"
        assertArrayEquals(
            arrayOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf").sortedArray(),
            solution.letterCombinations(digits).toTypedArray().sortedArray()
        )
    }

    @Test
    fun `test case 2`() {
        val digits = ""
        assertArrayEquals(
            emptyArray<String>(),
            solution.letterCombinations(digits).toTypedArray()
        )
    }

    @Test
    fun `test case 3`() {
        val digits = "2"
        assertArrayEquals(
            arrayOf("a", "b", "c").sortedArray(),
            solution.letterCombinations(digits).toTypedArray().sortedArray()
        )
    }

    @Test
    fun `test assert array`() {
        assertArrayEquals(
            arrayOf("a", "b", "c").sortedArray(),
            arrayOf("c", "b", "a").sortedArray(),
        )
    }
}
