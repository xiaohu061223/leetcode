package problem.dp.problem303

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumArrayTest {
    @Test
    fun `test case`() {
        val obj = NumArray(intArrayOf(-2, 0, 3, -5, 2, -1))
        assertThat(obj.sumRange(0, 2)).isEqualTo(1)
        assertThat(obj.sumRange(2, 5)).isEqualTo(-1)
        assertThat(obj.sumRange(0, 5)).isEqualTo(-3)
    }
}
