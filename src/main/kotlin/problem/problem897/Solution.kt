package problem.problem897

import common.TreeNode

/**
 * https://leetcode-cn.com/problems/increasing-order-search-tree/
 */
class Solution {
    fun increasingBST(root: TreeNode?): TreeNode? {
        val values = inOrderSearch(root)
        val dummy = TreeNode(Int.MAX_VALUE)
        var current: TreeNode? = dummy
        values.forEach {
            current?.right = TreeNode(it)
            current = current?.right
        }
        return dummy.right
    }

    private fun inOrderSearch(root: TreeNode?): IntArray = when (root) {
        null -> intArrayOf()
        else -> inOrderSearch(root.left) + intArrayOf(root.`val`) + inOrderSearch(root.right)
    }
}
