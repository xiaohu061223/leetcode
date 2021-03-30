package problem.mergeKSortedLists

import common.ListNode
import common.emptyLinkedList
import common.singlyLinkedListOf
import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<ListNode?>, ListNode?>() {

    override val solutions: List<ISolution<Array<ListNode?>, ListNode?>> = listOf(Solution())

    override val testCases: List<Pair<Array<ListNode?>, ListNode?>> = listOf(
        arrayOf(
            singlyLinkedListOf(1, 4, 5),
            singlyLinkedListOf(1, 3, 4),
            singlyLinkedListOf(2, 6),
        ) to singlyLinkedListOf(1, 1, 2, 3, 4, 4, 5, 6),
        emptyArray<ListNode?>() to emptyLinkedList(),
        arrayOf(emptyLinkedList()) to emptyLinkedList(),
    )
}
