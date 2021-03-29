package problem.mergeTwoSortedLists

import common.toArray
import common.buildLink
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val array1 = intArrayOf(1, 2, 4)
        val array2 = intArrayOf(1, 3, 4)
        val result = solution.mergeTwoLists(array1.buildLink(), array2.buildLink())
        assertArrayEquals(
            intArrayOf(1, 1, 2, 3, 4, 4),
            result?.toArray() ?: intArrayOf()
        )
    }

    @Test
    fun `test case 2`() {
        val array1 = intArrayOf()
        val array2 = intArrayOf()
        val result = solution.mergeTwoLists(array1.buildLink(), array2.buildLink())
        assertArrayEquals(
            intArrayOf(),
            result?.toArray() ?: intArrayOf()
        )
    }

    @Test
    fun `test case 3`() {
        val array1 = intArrayOf()
        val array2 = intArrayOf(0)
        val result = solution.mergeTwoLists(array1.buildLink(), array2.buildLink())
        assertArrayEquals(
            intArrayOf(0),
            result?.toArray() ?: intArrayOf()
        )
    }
}
