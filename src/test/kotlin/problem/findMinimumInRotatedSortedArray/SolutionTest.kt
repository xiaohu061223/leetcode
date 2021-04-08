package problem.findMinimumInRotatedSortedArray

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {
    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution())
    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(3, 4, 5, 1, 2) to 1,
        intArrayOf(4, 5, 6, 7, 0, 1, 2) to 0,
        intArrayOf(11, 13, 15, 17) to 11,
        intArrayOf(3, 1, 2) to 1,
    )
}
