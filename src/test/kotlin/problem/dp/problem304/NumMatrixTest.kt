package problem.dp.problem304

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumMatrixTest {
    @Test
    fun `test case`() {
        val numMatrix = NumMatrix(
            arrayOf(
                intArrayOf(3, 0, 1, 4, 2),
                intArrayOf(5, 6, 3, 2, 1),
                intArrayOf(1, 2, 0, 1, 5),
                intArrayOf(4, 1, 0, 1, 7),
                intArrayOf(1, 0, 3, 0, 5),
            )
        )
        assertThat(numMatrix.sumRegion(2, 1, 4, 3)).isEqualTo(8)
        assertThat(numMatrix.sumRegion(1, 1, 2, 2)).isEqualTo(11)
        assertThat(numMatrix.sumRegion(1, 2, 2, 4)).isEqualTo(11)
    }
}

