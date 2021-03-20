package problem.reverseBetwween

import common.buildArray
import common.buildLink
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val result = solution.reverseBetween(
            intArrayOf(1, 2, 3, 4, 5).buildLink(),
            2,
            4,
        )?.buildArray()
        assertThat(result).isEqualTo(intArrayOf(1, 4, 3, 2, 5))
    }

    @Test
    fun `test case 2`() {
        val result = solution.reverseBetween(
            intArrayOf(5).buildLink(),
            1,
            1,
        )?.buildArray()
        assertThat(result).isEqualTo(intArrayOf(5))
    }

    @Test
    fun `test case 3`() {
        val result = solution.reverseBetween(
            intArrayOf(3,5).buildLink(),
            1,
            2,
        )?.buildArray()
        assertThat(result).isEqualTo(intArrayOf(5,3))
    }
}
