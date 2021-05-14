package problem.problem12

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, String>() {
    override val solutions: List<ISolution<Int, String>> = listOf(Solution())
    override val testCases: List<Pair<Int, String>> = listOf(
        3 to "III",
        4 to "IV",
        9 to "IX",
        58 to "LVIII",
        1994 to "MCMXCIV",
    )
}
