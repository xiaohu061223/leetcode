package problem.dp.houseRobber

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {
    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution())
    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(1, 2, 3, 1) to 4,
        intArrayOf(2, 7, 9, 3, 1) to 12,
    )
}
