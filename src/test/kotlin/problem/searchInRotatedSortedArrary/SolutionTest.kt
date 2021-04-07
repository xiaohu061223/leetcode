package problem.searchInRotatedSortedArrary

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {
    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>> = listOf(Solution())
    override val testCases: List<Pair<Pair<IntArray, Int>, Int>> = listOf(
        (intArrayOf(4, 5, 6, 7, 0, 1, 2) to 0) to 4,
        (intArrayOf(4, 5, 6, 7, 0, 1, 2) to 3) to -1,
        (intArrayOf(1) to 0) to -1,
        (intArrayOf(1, 3) to 0) to -1,
        (intArrayOf(1, 3, 5) to 1) to 0,
    )
}
