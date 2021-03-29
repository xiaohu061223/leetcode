package problem.addTwoNumbers

import common.ListNode
import common.singlyLinkedListOf
import core.ISolution
import core.ISolutionTest

class SolutionTest : ISolutionTest<List<ListNode?>, ListNode?>() {
    private val normalSolution = NormalSolution()
    private val recursionSolution = RecursionSolution()

    override val solutions: List<ISolution<List<ListNode?>, ListNode?>> = listOf(
        normalSolution,
        recursionSolution,
    )
    override val testCases: List<Pair<List<ListNode?>, ListNode?>> = listOf(
        listOf(singlyLinkedListOf(2, 4, 3), singlyLinkedListOf(5, 6, 4)) to singlyLinkedListOf(7, 0, 8),
        listOf(singlyLinkedListOf(0), singlyLinkedListOf(0)) to singlyLinkedListOf(0),
        listOf(singlyLinkedListOf(9, 9, 9, 9, 9, 9, 9),
            singlyLinkedListOf(9, 9, 9, 9)) to singlyLinkedListOf(8, 9, 9, 9, 0, 0, 0, 1),
    )
}

