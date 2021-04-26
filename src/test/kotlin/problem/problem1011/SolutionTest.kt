package problem.problem1011

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {
    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>> = listOf(Solution())
    override val testCases: List<Pair<Pair<IntArray, Int>, Int>> = listOf(
        (intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) to 5) to 15,
        (intArrayOf(3, 2, 2, 4, 1, 4) to 3) to 6,
        (intArrayOf(1, 2, 3, 1, 1) to 4) to 3,
    )
}
