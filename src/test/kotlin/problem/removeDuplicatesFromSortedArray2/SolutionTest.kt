package problem.removeDuplicatesFromSortedArray2

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {
    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution())
    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(1, 1, 1, 2, 2, 3) to 5,
        intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3) to 7,
    )
}
