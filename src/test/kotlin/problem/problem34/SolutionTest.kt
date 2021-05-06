package problem.problem34

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, IntArray>() {
    override val solutions: List<ISolution<Pair<IntArray, Int>, IntArray>> = listOf(Solution())
    override val testCases: List<Pair<Pair<IntArray, Int>, IntArray>> = listOf(
        intArrayOf(5, 7, 7, 8, 8, 10) to 8 to intArrayOf(3, 4),
        intArrayOf(5, 7, 7, 8, 8, 10) to 6 to intArrayOf(-1, -1),
        intArrayOf() to 0 to intArrayOf(-1, -1),
        intArrayOf(1) to 1 to intArrayOf(0, 0),
        intArrayOf(1, 3) to 1 to intArrayOf(0, 0),
    )
}
