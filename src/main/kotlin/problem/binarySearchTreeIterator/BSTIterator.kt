package problem.binarySearchTreeIterator

import common.TreeNode

class BSTIterator(root: TreeNode?) {
    var stack = mutableListOf<Int>()

    init {
        stack = dfs(root)
    }

    fun next(): Int = stack.removeAt(0)

    fun hasNext(): Boolean = stack.isNotEmpty()

    private fun dfs(root: TreeNode?): MutableList<Int> = when (root) {
        null -> mutableListOf()
        else -> (dfs(root.left) + listOf(root.`val`) + dfs(root.right)).toMutableList()
    }
}
