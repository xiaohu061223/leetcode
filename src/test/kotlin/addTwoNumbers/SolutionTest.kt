package addTwoNumbers

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

    @Test
    fun `create link function test`() {
        val array = intArrayOf(1, 2, 4)
        val link = array.buildLink()
        assertNotNull(link)
        assertEquals(link.`val`, 1)
        assertEquals(link.next?.`val`, 2)
        assertEquals(link.next?.next?.`val`, 4)
        assertEquals(link.next?.next?.next, null)
    }
}

private fun IntArray.buildLink(): ListNode? {
    if (this.isEmpty()) return null
    val head = ListNode(-1)
    var current = head
    this.forEach {
        val node = ListNode(it)
        current.next = node
        current = node
    }
    return head.next
}
