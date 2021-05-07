package problem.problem1486

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Int, Int>, Int>() {
    override val solutions: List<ISolution<Pair<Int, Int>, Int>> = listOf(Solution())
    override val testCases: List<Pair<Pair<Int, Int>, Int>> = listOf(
        5 to 0 to 8,
        4 to 3 to 8,
        1 to 7 to 7,
        10 to 5 to 2,
    )
}

