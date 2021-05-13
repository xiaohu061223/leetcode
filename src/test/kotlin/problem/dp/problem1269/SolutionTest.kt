package problem.dp.problem1269

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Int, Int>, Int>() {
    override val solutions: List<ISolution<Pair<Int, Int>, Int>> = listOf(Solution())
    override val testCases: List<Pair<Pair<Int, Int>, Int>> = listOf(
        3 to 2 to 4,
        2 to 4 to 2,
        4 to 2 to 8,
        4 to 3 to 9,
        27 to 7 to 127784505,
        47 to 38 to 318671228,
        430 to 148488 to 525833932,
    )
}
