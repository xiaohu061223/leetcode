package problem.validParentheses

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Boolean>() {
    override val solutions: List<ISolution<String, Boolean>> = listOf(Solution())
    override val testCases: List<Pair<String, Boolean>> = listOf(
        "()" to true,
        "()[]{}" to true,
        "(]" to false,
        "([)]" to false,
        "{[]}" to true,
    )
}
