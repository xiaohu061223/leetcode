package problem.removeElement

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {
    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>>
        get() = listOf(Solution())
    override val testCases: List<Pair<Pair<IntArray, Int>, Int>>
        get() = listOf(
            (intArrayOf(3, 2, 2, 3) to 3 to 2),
            (intArrayOf(0, 1, 2, 2, 3, 0, 4, 2) to 2 to 5),
        )
}
