package problem.subsetsWithDup

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Set<List<Int>>>() {
    override val solutions: List<ISolution<IntArray, Set<List<Int>>>> = listOf(Solution())
    override val testCases: List<Pair<IntArray, Set<List<Int>>>> = listOf(
        intArrayOf(1, 2, 2) to setOf(listOf(), listOf(1), listOf(1, 2), listOf(1, 2, 2), listOf(2), listOf(2, 2))
    )
}
