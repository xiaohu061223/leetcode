package problem.xor.problem342

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Boolean>() {
    override val solutions: List<ISolution<Int, Boolean>>
        get() = listOf(Solution())
    override val testCases: List<Pair<Int, Boolean>>
        get() = listOf(
            16 to true,
            5 to false,
            1 to true,
            8 to false,
            2 to false,
        )
}
