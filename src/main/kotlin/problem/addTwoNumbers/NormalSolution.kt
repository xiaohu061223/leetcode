package problem.addTwoNumbers

import common.ListNode
import core.ISolution

/**
 * 给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以0开头。
 */
class NormalSolution : ISolution<List<ListNode?>, ListNode?> {
    private fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val head = ListNode(-1)
        var current: ListNode? = head
        var needPlusOne = 0
        var v1 = l1
        var v2 = l2

        while (v1 != null || v2 != null) {
            val sums = (v1?.`val` ?: 0) + (v2?.`val` ?: 0) + needPlusOne
            needPlusOne = sums / 10
            val newNode = ListNode(sums % 10)
            current!!.next = newNode
            current = current.next
            if (v1 != null) {
                v1 = v1.next
            }
            if (v2 != null) {
                v2 = v2.next
            }
        }
        if (needPlusOne == 1) {
            current!!.next = ListNode(1)
        }
        return head.next
    }

    override fun run(input: List<ListNode?>): ListNode? = addTwoNumbers(input[0], input[1])
}
