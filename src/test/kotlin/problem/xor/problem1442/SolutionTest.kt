package problem.xor.problem1442

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {
    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution())
    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(2, 3, 1, 6, 7) to 4,
        intArrayOf(1, 1, 1, 1, 1) to 10,
        intArrayOf(2, 3) to 0,
        intArrayOf(1, 3, 5, 7, 9) to 3,
        intArrayOf(7, 11, 12, 9, 5, 2, 7, 17, 22) to 8,
        intArrayOf(218, 218) to 1,
    )
}
