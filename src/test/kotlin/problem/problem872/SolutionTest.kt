package problem.problem872

import common.TreeNode
import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<TreeNode?, TreeNode?>, Boolean>() {
    override val canTest: Boolean = false
    override val solutions: List<ISolution<Pair<TreeNode?, TreeNode?>, Boolean>> = listOf(Solution())
    override val testCases: List<Pair<Pair<TreeNode?, TreeNode?>, Boolean>> = listOf((null to null) to false)
}
