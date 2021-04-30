package problem.problem633

import core.ISolution

class Solution : ISolution<Int, Boolean> {
    private fun judgeSquareSum(c: Int): Boolean = dp(c, 0, Math.sqrt(c.toDouble()).toInt())

    private tailrec fun dp(target: Int, a: Int, b: Int): Boolean = when {
        target == a * a + b * b -> true
        a > b -> false
        target > a * a + b * b -> dp(target, a + 1, b)
        else -> dp(target, a, b - 1)
    }

    override fun run(input: Int): Boolean = judgeSquareSum(input)
}
