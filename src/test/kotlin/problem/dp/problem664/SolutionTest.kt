package problem.dp.problem664

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {
    override val solutions: List<ISolution<String, Int>> = listOf(Solution())
    override val testCases: List<Pair<String, Int>> = listOf(
        "aaabbb" to 2,
        "aba" to 2,
    )
}

