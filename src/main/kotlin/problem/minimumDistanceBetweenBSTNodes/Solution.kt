package problem.minimumDistanceBetweenBSTNodes

import common.TreeNode
import core.ISolution

class Solution : ISolution<TreeNode?, Int> {
    private fun minDiffInBST(root: TreeNode?): Int {
        val list = dfs(root)
        return list.mapIndexed { index, i ->
            if (index == 0) Integer.MAX_VALUE else i - list[index - 1]
        }.minOrNull() ?: 0
    }

    private fun dfs(root: TreeNode?): List<Int> = when (root) {
        null -> emptyList()
        else -> dfs(root.left) + root.`val` + dfs(root.right)
    }

    override fun run(input: TreeNode?): Int {
        return minDiffInBST(input)
    }
}
