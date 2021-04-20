package problem.implementStrstr

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, String>, Int>() {
    override val solutions: List<ISolution<Pair<String, String>, Int>>
        get() = listOf(Solution())
    override val testCases: List<Pair<Pair<String, String>, Int>>
        get() = listOf(
            ("hello" to "ll") to 2,
//            ("aaaaa" to "baa") to -1,
//            ("" to "") to 0,
        )
}
