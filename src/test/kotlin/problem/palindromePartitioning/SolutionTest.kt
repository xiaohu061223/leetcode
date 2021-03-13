package problem.palindromePartitioning

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val result = solution.partition("aab")
        assertThat(result).containsExactlyInAnyOrder(
            listOf("aa", "b"),
            listOf("a", "a", "b")
        )
    }

    @Test
    fun `test case 2`() {
        val result = solution.partition("aabb")
        assertThat(result).containsExactlyInAnyOrder(
            listOf("aa", "b", "b"),
            listOf("aa", "bb"),
            listOf("a", "a", "b", "b"),
            listOf("a", "a", "bb")
        )
    }
}
