package problem.rotateList

import common.ListNode

class Solution {
    fun rotateRight(head: ListNode?, k: Int): ListNode? = head?.run {
        val last = this.last()
        val length = this.length()
        val moveCount = length - (k % length) - 1
        last.next = head
        var needCutNode = head
        repeat(moveCount) { needCutNode = needCutNode?.next }
        val newHead = needCutNode?.next
        needCutNode?.next = null
        newHead
    }

    private fun ListNode.last(): ListNode {
        var last = this
        while (last.next != null) last = last.next!!
        return last
    }

    private fun ListNode.length(): Int {
        var current: ListNode? = this
        var count = 0
        while (current != null) {
            current = current.next
            count++
        }
        return count
    }
}
