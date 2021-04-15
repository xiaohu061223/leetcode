package problem.minimumDistanceBetweenBSTNodes

import common.TreeNode
import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<TreeNode?, Int>() {
    override val solutions: List<ISolution<TreeNode?, Int>> = listOf(Solution())

    // TODO("build tree node")
    override val testCases: List<Pair<TreeNode?, Int>> = listOf(
    )
}
