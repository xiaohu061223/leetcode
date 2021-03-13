package problem.regularExpMatching

/**
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.'和'*'的正则表达式匹配。
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖整个字符串 s 的，而不是部分字符串。

 */
class Solution {
    /*
       finite-state machine
     */
    fun isMatch(s: String, p: String): Boolean = regex(s, p)

    private fun regex(s: String, p: String): Boolean {
        if (p.isEmpty()) return s.isEmpty()
        val firstMatch = s.isNotEmpty() && (p[0] == s[0] || p[0] == '.')
        return if (p.length >= 2 && p[1] == '*') {
            regex(s, p.substring(2)) || (firstMatch && regex(s.substring(1), p))
        } else {
            firstMatch && regex(s.substring(1), p.substring(1))
        }
    }
}
