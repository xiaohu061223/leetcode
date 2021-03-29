package problem.addTwoNumbers

import common.ListNode
import core.ISolution

class RecursionSolution : ISolution<List<ListNode?>, ListNode?> {

    private fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        return recursion(l1, l2, 0)
    }

    private fun recursion(l1: ListNode?, l2: ListNode?, needPlus: Int): ListNode? {
        if (l1 == null && l2 == null && needPlus == 0) return null
        val sums = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + needPlus
        val newNode = ListNode(sums % 10)
        newNode.next = recursion(l1?.next, l2?.next, sums / 10)
        return newNode
    }

    override fun run(input: List<ListNode?>): ListNode? = addTwoNumbers(input[0], input[1])
}
