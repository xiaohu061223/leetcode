package problem

import core.ISolution
import core.ISolutionTest
import problem.problem633.Solution

internal class SolutionTest : ISolutionTest<Int, Boolean>() {
    override val solutions: List<ISolution<Int, Boolean>> = listOf(Solution())
    override val testCases: List<Pair<Int, Boolean>> = listOf(
        5 to true,
        3 to false,
        4 to true,
        2 to true,
        1 to true,
    )
}
