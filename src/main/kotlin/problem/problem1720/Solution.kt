package problem.problem1720

import core.ISolution

/**
 * https://leetcode-cn.com/problems/decode-xored-array/
 */
class Solution : ISolution<Pair<IntArray, Int>, IntArray> {

    override fun run(input: Pair<IntArray, Int>): IntArray {
        return decode(input.first, input.second)
    }

    private fun decode(encoded: IntArray, first: Int): IntArray {
        var current = first
        return intArrayOf(first) + encoded.map {
            val result = current.xor(it)
            current = result
            current
        }
    }
}
