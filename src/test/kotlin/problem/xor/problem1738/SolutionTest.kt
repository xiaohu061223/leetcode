package problem.xor.problem1738

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Array<IntArray>, Int>, Int>() {
    override val solutions: List<ISolution<Pair<Array<IntArray>, Int>, Int>> = listOf(Solution())
    override val testCases: List<Pair<Pair<Array<IntArray>, Int>, Int>> = listOf(
        arrayOf(intArrayOf(5, 2), intArrayOf(1, 6)) to 1 to 7,
        arrayOf(intArrayOf(5, 2), intArrayOf(1, 6)) to 2 to 5,
        arrayOf(intArrayOf(5, 2), intArrayOf(1, 6)) to 3 to 4,
        arrayOf(intArrayOf(5, 2), intArrayOf(1, 6)) to 4 to 0,
    )
}
