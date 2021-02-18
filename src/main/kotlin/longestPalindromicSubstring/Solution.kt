package longestPalindromicSubstring

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 */
class Solution {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) return s
        var left = 0
        var right = 0
        s.forEachIndexed { index, _ ->
            val len1 = expandAndGetMax(s, index, index)
            val len2 = expandAndGetMax(s, index, index + 1)
            val maxLen = len1.coerceAtLeast(len2)
            if (maxLen > right - left + 1) {
                left = index - (maxLen - 1) / 2
                right = index + maxLen / 2
            }
        }
        return s.substring(left, right + 1)
    }

    private fun expandAndGetMax(s: String, left: Int, right: Int): Int {
        var leftIndex = left
        var rightIndex = right
        while (leftIndex >= 0 && rightIndex < s.length && s[leftIndex] == s[rightIndex]) {
            leftIndex--
            rightIndex++
        }
        return rightIndex - leftIndex - 1
    }
}
