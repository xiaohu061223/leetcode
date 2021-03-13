package problem.longestSubstringWithoutRepeatingCharacters

import kotlin.math.max

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
class Solution {

    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        var start = 0
        var end = 0
        var maxLength = 0
        val set = mutableSetOf<Char>()
        while (end < s.length) {
            if (!set.contains(s[end])) {
                set.add(s[end])
                maxLength = max(maxLength, set.size)
                end++
            } else {
                set.remove(s[start])
                start++
            }
        }
        return maxLength
    }
}
