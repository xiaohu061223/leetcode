package problem.problem938

import common.TreeNode

/**
 * https://leetcode-cn.com/problems/range-sum-of-bst/
 */
class Solution {
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int = when {
        root == null -> 0
        root.`val` > high -> rangeSumBST(root.left, low, high)
        root.`val` < low -> rangeSumBST(root.right, low, high)
        else -> root.`val` + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
    }
}
