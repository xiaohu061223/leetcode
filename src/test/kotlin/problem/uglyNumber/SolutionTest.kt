package problem.uglyNumber

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Boolean>() {
    override val solutions: List<ISolution<Int, Boolean>> = listOf(Solution())
    override val testCases: List<Pair<Int, Boolean>> = listOf(
        6 to true,
        8 to true,
        14 to false,
        1 to true,
    )
}
