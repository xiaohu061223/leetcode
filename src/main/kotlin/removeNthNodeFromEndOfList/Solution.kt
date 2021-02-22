package removeNthNodeFromEndOfList

import common.ListNode

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head == null || n < 0) return head
        val dummy = ListNode(-1)
        dummy.next = head
        val index = getLinkLength(head) - n + 1
        var current = dummy
        for (i in 1 until index) {
            current = current.next!!
        }
        current.next = current.next?.next
        return dummy.next
    }

    private fun getLinkLength(head: ListNode): Int = if (head.next != null) 1 + getLinkLength(head.next!!) else 1

    /**
     * 复杂度 O(n) 快慢指针法, 通常加一个dummy的头节点方便边界条件的书写
     */
    fun removeNThFromEndV1(head: ListNode?, n: Int): ListNode? {
        if (head == null || n < 0) return head
        val dummy = ListNode(-1)
        dummy.next = head
        var slowPointer: ListNode? = dummy
        var fastPointer = getNthNode(dummy, n)
        while (fastPointer.next != null) {
            slowPointer = slowPointer!!.next
            fastPointer = fastPointer.next!!
        }
        slowPointer!!.next = slowPointer.next?.next
        return dummy.next
    }

    private fun getNthNode(head: ListNode, n: Int): ListNode {
        var current: ListNode? = head
        for (i in 0 until n) {
            current = current?.next
        }
        return current!!
    }
}
