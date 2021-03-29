package common

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

fun IntArray.buildLink(): ListNode? {
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

fun singlyLinkedListOf(vararg elements: Int) = elements.buildLink()

fun ListNode.toArray(): IntArray = recursion(this, intArrayOf())

private fun recursion(node: ListNode, array: IntArray): IntArray {
    val newArray = array.plus(node.`val`)
    return if (node.next != null) recursion(node.next!!, newArray) else newArray
}

class ExtensionTest {
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

    @Test
    fun `link to array`() {
        val array = intArrayOf(1, 2, 3, 4, 5)
        val newArray = array.buildLink()?.toArray()
        assertArrayEquals(newArray, array)
    }
}
