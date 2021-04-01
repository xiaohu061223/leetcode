package problem.clumsyFactorial

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Int>() {
    override val solutions: List<ISolution<Int, Int>> = listOf(Solution())
    override val testCases: List<Pair<Int, Int>> = listOf(
        4 to 7,
        10 to 12,
        12 to 13,
    )
}
