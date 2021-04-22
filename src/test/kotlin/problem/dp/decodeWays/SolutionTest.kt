package problem.dp.decodeWays

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {
    override val solutions: List<ISolution<String, Int>> = listOf(Solution())
    override val testCases: List<Pair<String, Int>> = listOf(
        "12" to 2,
        "226" to 3,
        "0" to 0,
        "06" to 0,
    )
}
