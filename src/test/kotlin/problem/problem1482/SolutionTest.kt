package problem.problem1482

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Triple<IntArray, Int, Int>, Int>() {
    override val solutions: List<ISolution<Triple<IntArray, Int, Int>, Int>> = listOf(Solution())
    override val testCases: List<Pair<Triple<IntArray, Int, Int>, Int>> = listOf(
        Triple(intArrayOf(1, 10, 3, 10, 2), 3, 1) to 3,
        Triple(intArrayOf(1, 10, 3, 10, 2), 3, 2) to -1,
        Triple(intArrayOf(7, 7, 7, 7, 12, 7, 7), 2, 3) to 12,
        Triple(intArrayOf(1000000000, 1000000000), 1, 1) to 1000000000,
        Triple(intArrayOf(1, 10, 2, 9, 3, 8, 4, 7, 5, 6), 4, 2) to 9,
    )
}

