package problem.rotateList

import common.buildArray
import common.buildLink
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val result = solution.rotateRight(intArrayOf(1, 2, 3, 4, 5).buildLink(), 2)
        assertThat(result?.buildArray()).isEqualTo(intArrayOf(4, 5, 1, 2, 3))
    }

    @Test
    fun `test case 2`() {
        val result = solution.rotateRight(intArrayOf(0, 1, 2).buildLink(), 4)
        assertThat(result?.buildArray()).isEqualTo(intArrayOf(2, 0, 1))
    }
}
