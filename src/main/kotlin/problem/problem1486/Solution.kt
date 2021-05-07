package problem.problem1486

import core.ISolution

/**
 * https://leetcode-cn.com/problems/xor-operation-in-an-array/
 */
class Solution : ISolution<Pair<Int, Int>, Int> {
    override fun run(input: Pair<Int, Int>): Int = xorOperation(input.first, input.second)

    private fun xorOperation(n: Int, start: Int): Int =
        IntArray(n) { i -> start + 2 * i }.reduce { acc, i -> acc.xor(i) }
}
