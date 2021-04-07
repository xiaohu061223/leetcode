package problem.searchInRotatedSortedArray2

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Boolean>() {
    override val solutions: List<ISolution<Pair<IntArray, Int>, Boolean>> = listOf(Solution())
    override val testCases: List<Pair<Pair<IntArray, Int>, Boolean>> = listOf(
        (intArrayOf(2, 5, 6, 0, 0, 1, 2) to 0) to true,
        (intArrayOf(2, 5, 6, 0, 0, 1, 2) to 3) to false,
        (intArrayOf(1, 0, 1, 1, 1) to 0) to true,
    )
}
