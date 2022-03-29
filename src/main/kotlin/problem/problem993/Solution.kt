package problem.problem993

import common.TreeNode
import core.ISolution

/**
 * https://leetcode-cn.com/problems/cousins-in-binary-tree/
 */
class Solution : ISolution<Triple<TreeNode?, Int, Int>, Boolean> {
    override fun run(input: Triple<TreeNode?, Int, Int>): Boolean {
        return isCousins(input.first, input.second, input.third)
    }

    private fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {
        if (root == null) return false
        findInfo(root, x, y, 0, root)
        return xNode !== null && yNode !== null && xNode!!.depth == yNode!!.depth && xNode!!.parentNode != yNode!!
            .parentNode
    }

    private fun findInfo(root: TreeNode?, x: Int, y: Int, depth: Int, parentNode: TreeNode) {
        if (root == null) return
        if (root.`val` == x) xNode = NodeStructure(x, parentNode, depth)
        if (root.`val` == y) yNode = NodeStructure(y, parentNode, depth)
        if (xNode !== null && yNode !== null) return

        findInfo(root.left, x, y, depth + 1, root)
        if (xNode !== null && yNode !== null) return

        findInfo(root.right, x, y, depth + 1, root)
    }

    data class NodeStructure(
        val value: Int,
        val parentNode: TreeNode,
        val depth: Int,
    )

    var xNode: NodeStructure? = null
    var yNode: NodeStructure? = null
}
