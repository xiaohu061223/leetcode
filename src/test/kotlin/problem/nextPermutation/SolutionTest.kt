package problem.nextPermutation

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, IntArray>() {
    override val solutions: List<ISolution<IntArray, IntArray>> = listOf(Solution())
    override val testCases: List<Pair<IntArray, IntArray>> = listOf(
        intArrayOf(1, 2, 3) to intArrayOf(1, 3, 2),
        intArrayOf(3, 2, 1) to intArrayOf(1, 2, 3),
        intArrayOf(3, 2, 1, 4) to intArrayOf(3, 2, 4, 1),
        intArrayOf(1, 1, 5) to intArrayOf(1, 5, 1),
        intArrayOf(1, 1, 2, 4, 3, 2) to intArrayOf(1, 1, 3, 2, 2, 4),
        intArrayOf(2, 4, 3, 2) to intArrayOf(3, 2, 2, 4),
        intArrayOf(1, 2, 3, 2) to intArrayOf(1, 3, 2, 2),
        intArrayOf(1) to intArrayOf(1),
    )
}
