package problem.numDistinct

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    @Disabled
    fun `test case 1`() {
        assertThat(
            solution.numDistinct(
                "rabbbit",
                "rabbit",
            )
        )
            .isEqualTo(3)

        assertThat(
            solution.numDistinct(
                "babgbag",
                "bag",
            )
        )
            .isEqualTo(5)
    }
}
