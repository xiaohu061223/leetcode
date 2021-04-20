package problem.implementStrstr

import core.ISolution

class Solution : ISolution<Pair<String, String>, Int> {
    private fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        if (haystack.isEmpty()) return -1
        var i = 0
        while (i < haystack.length) {
            if (haystack[i] == needle.first()) {
                var j = i
                while (j < (needle.length + i).coerceAtMost(haystack.length)) {
                    if (haystack[j] != needle[j - i]) break
                    j++
                }
                if (j - i == needle.length) return i
            }
            i++
        }
        return -1
    }

    override fun run(input: Pair<String, String>): Int {
        return strStr(input.first, input.second)
    }
}
