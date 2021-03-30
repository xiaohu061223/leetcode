package problem.searchMatrix

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Array<IntArray>, Int>, Boolean>() {
    private val solution = Solution()
    override val solutions: List<ISolution<Pair<Array<IntArray>, Int>, Boolean>> = listOf(solution)
    override val testCases: List<Pair<Pair<Array<IntArray>, Int>, Boolean>> =
        listOf(
            (arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60)) to 3) to true,
            (arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(10, 11, 16, 20), intArrayOf(23, 30, 34, 60)) to 13) to false,
            (arrayOf(intArrayOf(1), intArrayOf(3)) to 4) to false
        )
}
