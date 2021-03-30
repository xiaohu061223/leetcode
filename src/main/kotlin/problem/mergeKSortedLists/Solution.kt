package problem.mergeKSortedLists

import common.ListNode
import core.ISolution
import kotlin.Int.Companion.MAX_VALUE
import kotlin.Int.Companion.MIN_VALUE

/**
 * https://leetcode-cn.com/problems/merge-k-sorted-lists/
 */
class Solution : ISolution<Array<ListNode?>, ListNode?> {
    private fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val dummy = ListNode(MIN_VALUE)
        var current: ListNode? = dummy
        while (lists.any { it != null }) {
            var valueRecord = MAX_VALUE
            var indexRecord = 0
            lists.forEachIndexed { i, listNode ->
                if (listNode != null && listNode.`val` < valueRecord) {
                    valueRecord = listNode.`val`
                    indexRecord = i
                }
            }
            lists[indexRecord] = lists[indexRecord]?.next
            current?.next = ListNode(valueRecord)
            current = current?.next
        }
        return dummy.next
    }

    override fun run(input: Array<ListNode?>): ListNode? = mergeKLists(input)
}
