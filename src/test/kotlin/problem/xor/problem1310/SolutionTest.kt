package problem.xor.problem1310

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Array<IntArray>>, IntArray>() {
    override val solutions: List<ISolution<Pair<IntArray, Array<IntArray>>, IntArray>> = listOf(Solution())
    override val testCases: List<Pair<Pair<IntArray, Array<IntArray>>, IntArray>> = listOf(
        intArrayOf(1, 3, 4, 8) to arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(0, 3),
            intArrayOf(3, 3)
        ) to intArrayOf(2, 7, 14, 8),
        intArrayOf(4, 8, 2, 10) to arrayOf(
            intArrayOf(2, 3),
            intArrayOf(1, 3),
            intArrayOf(0, 0),
            intArrayOf(0, 3),
        ) to intArrayOf(8, 0, 4, 4),
    )
}
