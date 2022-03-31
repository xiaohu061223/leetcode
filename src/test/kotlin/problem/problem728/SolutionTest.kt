package problem.problem728

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Int, Int>, List<Int>>() {
    override val solutions: List<ISolution<Pair<Int, Int>, List<Int>>> = listOf(Solution())
    override val testCases: List<Pair<Pair<Int, Int>, List<Int>>> = listOf(
        ((1 to 22) to listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22)),
        ((47 to 85) to listOf(48, 55, 66, 77))
    )
}
