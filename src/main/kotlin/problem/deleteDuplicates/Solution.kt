package problem.deleteDuplicates

import common.ListNode

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? = head?.run {
        val dummy = ListNode(Int.MAX_VALUE)
        dummy.next = head
        var current: ListNode? = dummy
        while (current?.next != null && current.next!!.next != null) {
            if (current.next!!.`val` == current.next!!.next!!.`val`) {
                val value = current.next!!.`val`
                while (current.next != null && current.next!!.`val` == value)
                    current.next = current.next!!.next
            } else {
                current = current.next
            }
        }
        dummy.next
    }
}
