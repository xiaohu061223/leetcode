package nextGreaterElement2

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val nums = intArrayOf(1, 2, 1)
        val result = solution.nextGreaterElements(nums)
        Assertions.assertArrayEquals(intArrayOf(2, -1, 2), result)
    }
}
