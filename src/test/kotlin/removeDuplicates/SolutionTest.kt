package removeDuplicates

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val result = solution.removeDuplicates("abbaca")
        assertThat(result).isEqualTo("ca")
    }

    @Test
    fun `test case 2`() {
        val result = solution.removeDuplicates("aaaaa")
        assertThat(result).isEqualTo("a")
    }
}
