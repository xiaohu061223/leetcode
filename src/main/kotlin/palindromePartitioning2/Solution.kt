package palindromePartitioning2

class Solution {
    fun minCut(s: String): Int {
        if (s.isEmpty()) return 0
        val dpList = IntArray(s.length) { Int.MAX_VALUE }
        for (i in s.indices) {
            if (isPalindrome(s, 0, i)) dpList[i] = 0
            else {
                for (j in 0 until i) {
                    if (isPalindrome(s, j + 1, i)) dpList[i] = dpList[i].coerceAtMost(dpList[j] + 1)

                }
            }
        }
        return dpList[s.length - 1]
    }

    private tailrec fun isPalindrome(s: String, left: Int, right: Int): Boolean = when {
        left >= right -> true
        s[left] != s[right] -> false
        else -> isPalindrome(s, left + 1, right - 1)
    }
}
