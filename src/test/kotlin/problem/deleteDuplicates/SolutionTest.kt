package problem.deleteDuplicates

import common.buildArray
import common.buildLink
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        assertThat(
            solution.deleteDuplicates(
                intArrayOf(1, 2, 3, 3, 4, 4, 5).buildLink()
            )?.buildArray()
        ).isEqualTo(intArrayOf(1, 2, 5))

        assertThat(
            solution.deleteDuplicates(
                intArrayOf(1, 1, 1, 2, 3).buildLink()
            )?.buildArray()
        ).isEqualTo(intArrayOf(2, 3))
    }

}
