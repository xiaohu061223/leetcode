package addTwoNumbers

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull

class SolutionTest {
    @Test
    fun `add two numbers test case 1`() {
        val linkA = createLinkFromArray(intArrayOf(2, 4, 3))
        val linkB = createLinkFromArray(intArrayOf(5, 6, 4))
        val result = Solution().addTwoNumbers(linkA, linkB)
        assertNotNull(result)
        assertEquals(result.`val`, 7)
        assertEquals(result.next?.`val`, 0)
        assertEquals(result.next?.next?.`val`, 8)
    }

    @Test
    fun `add two numbers test case 2`() {
        val linkA = createLinkFromArray(intArrayOf(0))
        val linkB = createLinkFromArray(intArrayOf(0))
        val result = Solution().addTwoNumbers(linkA, linkB)
        assertNotNull(result)
        assertEquals(result.`val`, 0)
        assertNull(result.next)
    }

    @Test
    fun `add two numbers test case 3`() {
        val linkA = createLinkFromArray(intArrayOf(9, 9, 9, 9, 9, 9, 9))
        val linkB = createLinkFromArray(intArrayOf(9, 9, 9, 9))
        val result = Solution().addTwoNumbers(linkA, linkB)
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
        val link = createLinkFromArray(array)
        assertNotNull(link)
        assertEquals(link.`val`, 1)
        assertEquals(link.next?.`val`, 2)
        assertEquals(link.next?.next?.`val`, 4)
        assertEquals(link.next?.next?.next, null)
    }

    private fun createLinkFromArray(array: IntArray): ListNode? {
        if (array.isEmpty()) return null
        val head = ListNode(-1)
        var current = head
        array.forEach {
            val node = ListNode(it)
            current.next = node
            current = node
        }
        return head.next
    }
}
