package problem.calculate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val result = solution.calculate("1 + 1")
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `test case 2`() {
        val result = solution.calculate(" 2-1 + 2 ")
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun `test case 3`() {
        val result = solution.calculate("(1+(4+5+2)-3)+(6+8)")
        assertThat(result).isEqualTo(23)
    }

    @Test
    fun `test case 4`() {
        val result = solution.calculate("-2+1")
        assertThat(result).isEqualTo(-1)
    }
    @Test
    fun `test case 5`() {
        val result = solution.calculate("1+(-1+1)")
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `test case 6`() {
        val result = solution.calculate("3+2*2")
        assertThat(result).isEqualTo(7)
    }

    @Test
    fun `test case 7`() {
        val result = solution.calculate("3/2")
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `test case 8`() {
        val result = solution.calculate("3+5 / 2")
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun `test case 9`() {
        val result = solution.calculate("42")
        assertThat(result).isEqualTo(42)
    }

    @Test
    fun `test case 10`() {
        val result = solution.calculate("42/12")
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun `test case 11`() {
        val result = solution.calculate("0+0")
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `test case 12`() {
        val result = solution.calculate("- (3 + (4 + 5))")
        assertThat(result).isEqualTo(-12)
    }
}
