package problem.longestValidParentheses

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {
    override val solutions: List<ISolution<String, Int>> = listOf(Solution())
    override val testCases: List<Pair<String, Int>> = listOf(
        "(()" to 2,
        ")()())" to 4,
        "" to 0,
        "()(()" to 2,
        "()(())" to 6,
    )
}
