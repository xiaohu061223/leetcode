package common

fun treeNodeBracketOf(expression: String): TreeNode? {
    val trimmedExpression = expression.trim()
    if (trimmedExpression.isBlank()) return null
    if (trimmedExpression.length == 1) return TreeNode(trimmedExpression.first().code - 48)
    try {
        val root = TreeNode(trimmedExpression.first().code - 48)
        val first = findFirstBracketsContent(trimmedExpression.removePrefixOrEmpty(1))
        val second = findFirstBracketsContent(trimmedExpression.removePrefixOrEmpty(3 + first.size))
        root.left = treeNodeBracketOf(first.joinToString(""))
        root.right = treeNodeBracketOf(second.joinToString(""))
        return root
    } catch (e: Exception) {
        throw IllegalArgumentException("bracket expression is not valid")
    }
}

private fun String.removePrefixOrEmpty(cutSize: Int): String {
    if (cutSize < 0) throw IllegalArgumentException()
    return if (this.length <= cutSize) "" else this.substring(cutSize)
}

private fun findFirstBracketsContent(expression: String): Stack<Char> {
    if (expression.isBlank()) return emptyStack()
    var isFirstBracket = true
    val result = stackOf<Char>()
    val brackets = stackOf<Char>()
    expression.forEach {
        when (it) {
            '(' -> if (!isFirstBracket) {
                result.push('(')
                brackets.push('(')
            } else isFirstBracket = false
            ')' -> if (brackets.isNotEmpty()) {
                brackets.pop()
                result.push(')')
            } else return result
            else -> result.push(it)
        }
    }
    return result
}
