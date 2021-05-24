package problem.dp.problem1035

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, IntArray>, Int>() {
    override val solutions: List<ISolution<Pair<IntArray, IntArray>, Int>> = listOf(Solution())
    override val testCases: List<Pair<Pair<IntArray, IntArray>, Int>> = listOf(
        intArrayOf(1, 4, 2) to intArrayOf(1, 2, 4) to 2,
        intArrayOf(2, 5, 1, 2, 5) to intArrayOf(10, 5, 2, 1, 5, 2) to 3,
        intArrayOf(1, 3, 7, 1, 7, 5) to intArrayOf(1, 9, 2, 5, 1) to 2,
    )
}
