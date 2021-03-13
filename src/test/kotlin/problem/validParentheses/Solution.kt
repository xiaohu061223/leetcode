package problem.validParentheses

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */
class Solution {
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) return false
        var stack = charArrayOf()
        val parenthesesMap = mapOf('{' to '}', '[' to ']', '(' to ')')
        for (i in s.indices) {
            stack = if (parenthesesMap.containsKey(s[i])) {
                stack.plus(s[i])
            } else {
                if (parenthesesMap[stack.last()]!! == s[i]) stack.dropLast(1).toCharArray()
                else return false
            }
        }
        return stack.isEmpty()
    }
}
