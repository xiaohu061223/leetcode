package problem.uglyNumber2

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Int>() {
    override val solutions: List<ISolution<Int, Int>> = listOf(Solution())
    override val testCases: List<Pair<Int, Int>> = listOf(
        10 to 12,
        1 to 1,
    )
}
