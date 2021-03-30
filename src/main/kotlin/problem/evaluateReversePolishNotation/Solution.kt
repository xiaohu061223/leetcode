package problem.evaluateReversePolishNotation

/**
 * https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 */
class Solution {
    private val operations = listOf("+", "-", "/", "*")

    fun evalRPN(tokens: Array<String>): Int {
        val stack = mutableListOf<Int>()
        for (i in tokens) {
            if (operations.contains(i)) {
                stack.add(
                    operate(
                        stack.removeAt(stack.lastIndex),
                        stack.removeAt(stack.lastIndex),
                        i,
                    )
                )
            } else {
                stack.add(i.toInt())
            }
        }
        return stack.first()
    }

    private fun operate(first: Int, second: Int, operation: String): Int = when (operation) {
        "+" -> second + first
        "-" -> second - first
        "/" -> second / first
        "*" -> second * first
        else -> 0
    }
}
