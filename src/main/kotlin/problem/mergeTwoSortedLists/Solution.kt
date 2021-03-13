package problem.mergeTwoSortedLists

import common.ListNode

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null && l2 == null) return null
        return merge(l1, l2)
    }

    private fun merge(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2
        if (l2 == null) return l1
        return if (l1.`val` < l2.`val`) {
            l1.next = merge(l1.next, l2)
            l1
        } else {
            l2.next = merge(l1, l2.next)
            l2
        }
    }
}
