package problem.xor.problem1720

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, IntArray>() {
    override val solutions: List<ISolution<Pair<IntArray, Int>, IntArray>> = listOf(Solution())
    override val testCases: List<Pair<Pair<IntArray, Int>, IntArray>> = listOf(
        intArrayOf(1, 2, 3) to 1 to intArrayOf(1, 0, 2, 1),
        intArrayOf(6, 2, 7, 3) to 4 to intArrayOf(4, 2, 0, 7, 4),
    )
}
