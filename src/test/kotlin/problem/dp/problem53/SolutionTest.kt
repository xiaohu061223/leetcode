package problem.dp.problem53

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {
    override val solutions: List<ISolution<IntArray, Int>>
        get() = listOf(Solution())
    override val testCases: List<Pair<IntArray, Int>>
        get() = listOf(
            intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4) to 6,
            intArrayOf(1) to 1,
            intArrayOf(0) to 0,
            intArrayOf(-1) to -1,
            intArrayOf(5, 4, -1, 7, 8) to 23,
            intArrayOf(1, -1, 1) to 1
        )
}
