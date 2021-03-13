package problem.twoSum

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun `two sum testcase 1`() {
        val nums = intArrayOf(2, 7, 11, 15)
        val target = 9
        val solution = Solution()
        val result = solution.twoSum(nums = nums, target = target)
        assertEquals(result.size, 2)
        assertEquals(result[0], 0)
        assertEquals(result[1], 1)
    }

    @Test
    fun `two sum testcase 2`() {
        val nums = intArrayOf(3, 2, 4)
        val target = 6
        val solution = Solution()
        val result = solution.twoSum(nums = nums, target = target)
        assertEquals(result.size, 2)
        assertEquals(result[0], 1)
        assertEquals(result[1], 2)
    }

    @Test
    fun `two sum testcase 3`() {
        val nums = intArrayOf(3, 3)
        val target = 6
        val solution = Solution()
        val result = solution.twoSum(nums = nums, target = target)
        assertEquals(result.size, 2)
        assertEquals(result[0], 0)
        assertEquals(result[1], 1)
    }
}
