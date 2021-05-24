package problem.dp.problem664

import core.ISolution

/**
 * https://leetcode-cn.com/problems/strange-printer/
 * dp[i][j] 表示字符串s在[i,j]的最少打印次数
 */
class Solution : ISolution<String, Int> {
    override fun run(input: String): Int = strangerPrinter(input)

    private fun strangerPrinter(s: String): Int {
        val dp = Array(s.length) { IntArray(s.length) { 1 } }
        for (i in s.length - 1 downTo 0) {
            for (j in i + 1 until s.length) {
                if (s[i] == s[j]) dp[i][j] = dp[i][j - 1]
                else {
                    var min = Int.MAX_VALUE
                    for (k in i until j) {
                        min = minOf(min, dp[i][k] + dp[k + 1][j])
                    }
                    dp[i][j] = min
                }
            }
        }
        return dp[0][s.length - 1]
    }
}
