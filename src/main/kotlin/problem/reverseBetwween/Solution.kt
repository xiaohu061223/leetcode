package problem.reverseBetwween

import common.ListNode

class Solution {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (head == null) return head
        val newHead = ListNode(-1)
        newHead.next = head
        var leftBeforeNode: ListNode? = newHead
        repeat(left - 1) { leftBeforeNode = leftBeforeNode?.next }
        val leftNode = leftBeforeNode?.next
        var rightNode = leftNode
        repeat(right - left) { rightNode = rightNode?.next }
        var rightAfterNode = rightNode?.next

        leftBeforeNode?.next = null
        rightNode?.next = null

        reserveLink(leftNode)

        leftBeforeNode?.next = rightNode
        leftNode?.next = rightAfterNode
        return newHead.next
    }

    private fun reserveLink(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        val last = reserveLink(head.next)
        head.next?.next = head
        head.next = null
        return last
    }
}
