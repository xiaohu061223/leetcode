package problem.dp.decodeWays

import core.ISolution

/**
 * https://leetcode-cn.com/problems/decode-ways/
 * dp[i] 为字符串s从0-i的方案数
 * dp[0] = 0
 * dp[1] = 1
 * dp[i] = ( if (s[i-1] != 0) dp[i-1] else 0 ) + ( if(s.copyRangeOf(i-2, i-2) <= 26]] && s[i-2] != 0) dp[i-2] else 0 )
 */
class Solution : ISolution<String, Int> {
    private fun numDecodings(s: String): Int {
        if (s.isEmpty() || s.startsWith('0')) return 0
        val dp = IntArray(s.length + 1) { 0 }
        if (s.length == 1) return 1
        dp[0] = 1
        for (i in 1 until s.length + 1) {
            if (s[i - 1] != '0') {
                dp[i] += dp[i - 1]
            }
            if (i > 1 && s[i - 2] != '0' && ((s[i - 2] - '0') * 10 + (s[i - 1] - '0')) <= 26) {
                dp[i] += dp[i - 2]
            }
        }
        return dp.last()
    }

    override fun run(input: String): Int = numDecodings(input)
}
