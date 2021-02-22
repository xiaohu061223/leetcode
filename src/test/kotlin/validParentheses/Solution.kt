package validParentheses

class Solution {
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) return false
        var stack = charArrayOf()
        for (i in s.indices) {
            when {
                s[i] == '{' || s[i] == '[' || s[i] == '(' -> {
                    stack = stack.plus(s[i])
                }
                else -> {
                    if (stack.isEmpty()) return false
                    if ((s[i] == '}' && stack.last() == '{') ||
                        (s[i] == ']' && stack.last() == '[') ||
                        (s[i] == ')' && stack.last() == '(')
                    ) stack = stack.dropLast(1).toCharArray() else return false
                }
            }
        }
        return stack.isEmpty()
    }
}
