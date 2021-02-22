package addTwoNumbers

import common.buildLink
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class SolutionTest {
    @Test
    fun `add two numbers test case 1`() {
        val linkA = intArrayOf(2, 4, 3).buildLink()
        val linkB = intArrayOf(5, 6, 4).buildLink()
        val result = Solution().addTwoNumbersRe(linkA, linkB)
        assertNotNull(result)
        assertEquals(result.`val`, 7)
        assertEquals(result.next?.`val`, 0)
        assertEquals(result.next?.next?.`val`, 8)
    }

    @Test
    fun `add two numbers test case 2`() {
        val linkA = intArrayOf(0).buildLink()
        val linkB = intArrayOf(0).buildLink()
        val result = Solution().addTwoNumbersRe(linkA, linkB)
        assertNotNull(result)
        assertEquals(result.`val`, 0)
        assertNull(result.next)
    }

    @Test
    fun `add two numbers test case 3`() {
        val linkA = intArrayOf(9, 9, 9, 9, 9, 9, 9).buildLink()
        val linkB = intArrayOf(9, 9, 9, 9).buildLink()
        val result = Solution().addTwoNumbersRe(linkA, linkB)
        assertNotNull(result)
        assertEquals(result.`val`, 8)
        assertEquals(result.next?.`val`, 9)
        assertEquals(result.next?.next?.`val`, 9)
        assertEquals(result.next?.next?.next?.`val`, 9)
        assertEquals(result.next?.next?.next?.next?.`val`, 0)
        assertEquals(result.next?.next?.next?.next?.next?.`val`, 0)
        assertEquals(result.next?.next?.next?.next?.next?.next?.`val`, 0)
        assertEquals(result.next?.next?.next?.next?.next?.next?.next?.`val`, 1)
    }

}

