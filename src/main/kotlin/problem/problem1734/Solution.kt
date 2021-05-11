package problem.problem1734

import core.ISolution

/**
 * https://leetcode-cn.com/problems/decode-xored-permutation/
 */
class Solution : ISolution<IntArray, IntArray> {
    override fun run(input: IntArray): IntArray = decode(input)

    private fun decode(encoded: IntArray): IntArray {
        val allXorSum = IntArray(encoded.size + 1) { it + 1 }.reduce { acc, i -> i.xor(acc) }
        val oldXorSum = encoded.foldIndexed(encoded[1]) { index, acc, i ->
            if (index >= 2 && (index % 2 == 1)) acc.xor(i) else acc
        }
        val firstValue = allXorSum.xor(oldXorSum)
        var current = firstValue
        return (listOf(firstValue) + encoded.map {
            val result = current.xor(it)
            current = result
            result
        }).toIntArray()
    }
}
