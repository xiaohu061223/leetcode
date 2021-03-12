package isValidSerialization

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val result = solution.isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#")
        assertThat(result).isTrue
    }

    @Test
    fun `test case 2`() {
        val result = solution.isValidSerialization("1,#")
        assertThat(result).isFalse
    }

    @Test
    fun `test case 3`() {
        val result = solution.isValidSerialization("9,#,#,1")
        assertThat(result).isFalse
    }
}
