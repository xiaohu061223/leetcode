package problem.problem1310

import core.ISolution

/**
 * https://leetcode-cn.com/problems/xor-queries-of-a-subarray/
 */
class Solution : ISolution<Pair<IntArray, Array<IntArray>>, IntArray> {
    override fun run(input: Pair<IntArray, Array<IntArray>>): IntArray = xorQueries(input.first, input.second)

    private fun xorQueries(arr: IntArray, queries: Array<IntArray>): IntArray {
        val helpers = IntArray(arr.size + 1) { arr[0] }
        repeat(arr.size) { helpers[it + 1] = helpers[it].xor(arr[it]) }
        return queries.map { helpers[it.first()].xor(helpers[it[1] + 1]) }.toIntArray()
    }
}
