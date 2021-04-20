package problem.dp.houseRober2

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {
    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution())
    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(2, 3, 2) to 3,
        intArrayOf(1, 2, 3, 1) to 4,
    )
}
