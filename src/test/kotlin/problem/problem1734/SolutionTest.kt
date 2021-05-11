package problem.problem1734

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, IntArray>() {
    override val solutions: List<ISolution<IntArray, IntArray>> = listOf(Solution())
    override val testCases: List<Pair<IntArray, IntArray>> = listOf(
        intArrayOf(3, 1) to intArrayOf(1, 2, 3),
        intArrayOf(6, 5, 4, 6) to intArrayOf(2, 4, 1, 5, 3),
    )
}

