package removeNthNodeFromEndOfList

import common.buildArray
import common.buildLink
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val solution = Solution()

    @Test
    fun `test case 1`() {
        val head = intArrayOf(1, 2, 3, 4, 5)
        val n = 2
        assertArrayEquals(
            intArrayOf(1, 2, 3, 5),
            solution.removeNThFromEndV1(head.buildLink(), 2)?.buildArray()
        )
    }

    @Test
    fun `test case 2`() {
        val head = intArrayOf(1)
        val n = 1
        assertArrayEquals(
            intArrayOf(),
            solution.removeNThFromEndV1(head.buildLink(), n)?.buildArray() ?: intArrayOf()
        )
    }

    @Test
    fun `test case 3`() {
        val head = intArrayOf(1, 2)
        val n = 1
        assertArrayEquals(
            intArrayOf(1),
            solution.removeNThFromEndV1(head.buildLink(), n)?.buildArray() ?: intArrayOf()
        )
    }
}
