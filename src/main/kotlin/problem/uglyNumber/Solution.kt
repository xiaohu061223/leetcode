package problem.uglyNumber

import core.ISolution

/**
 * https://leetcode-cn.com/problems/ugly-number/
 */
class Solution : ISolution<Int, Boolean> {
    override fun run(input: Int): Boolean = isUgly(input)
    private fun isUgly(n: Int): Boolean = when {
        n == 1 || n == 2 || n == 3 || n == 5 -> true
        n <= 0 -> false
        n % 2 == 0 -> isUgly(n / 2)
        n % 3 == 0 -> isUgly(n / 3)
        n % 5 == 0 -> isUgly(n / 5)
        else -> false
    }
}
