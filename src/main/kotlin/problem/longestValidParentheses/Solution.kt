package problem.longestValidParentheses

import core.ISolution

/**
 * https://leetcode-cn.com/problems/longest-valid-parentheses/
 */
class Solution : ISolution<String, Int> {
    private fun longestValidParentheses(s: String): Int {
        val stack = mutableListOf<Int>()
        stack.add(-1)
        var maxCounter = 0
        for (i in s.indices) {
            if (s[i] == '(') stack.add(i)
            else {
                stack.removeAt(stack.lastIndex)
                if (stack.isEmpty()) stack.add(i)
                else maxCounter = maxCounter.coerceAtLeast(i - stack.last())
            }
        }
        return maxCounter
    }

    override fun run(input: String): Int = longestValidParentheses(input)
}
