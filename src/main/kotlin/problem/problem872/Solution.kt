package problem.problem872

import common.TreeNode
import core.ISolution

/**
 * https://leetcode-cn.com/problems/leaf-similar-trees/
 */
class Solution : ISolution<Pair<TreeNode?, TreeNode?>, Boolean> {
    override fun run(input: Pair<TreeNode?, TreeNode?>): Boolean = leafSimilar(input.first, input.second)

    private fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val list1 = dfs(root1)
        val list2 = dfs(root2)
        if (list1.size != list2.size) return false
        list1.forEachIndexed { index, _ ->
            if (list1[index] != list2[index]) return false
        }
        return true
    }

    private fun dfs(root: TreeNode?): List<Int> {
        if (root == null) return emptyList()
        return dfs(root.left) + if (root.isLeaf()) listOf(root.`val`) else emptyList<Int>() + dfs(root.right)
    }

    private fun TreeNode.isLeaf() = this.left == null && this.right == null
}
