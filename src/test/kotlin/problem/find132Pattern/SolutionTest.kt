package problem.find132Pattern

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        assertThat(solution.find132pattern(intArrayOf(1, 2, 3, 4))).isFalse
        assertThat(solution.find132pattern(intArrayOf(3, 1, 4, 2))).isTrue
        assertThat(solution.find132pattern(intArrayOf(-1, 3, 2, 0))).isTrue
    }
}
