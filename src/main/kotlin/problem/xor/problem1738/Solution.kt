package problem.xor.problem1738

import core.ISolution

/**
 * https://leetcode-cn.com/problems/find-kth-largest-xor-coordinate-value/
 */
internal class Solution : ISolution<Pair<Array<IntArray>, Int>, Int> {
    override fun run(input: Pair<Array<IntArray>, Int>): Int = kthLargestValue(input.first, input.second)

    private fun kthLargestValue(matrix: Array<IntArray>, k: Int): Int {
        val results = mutableListOf<Int>()
        val helpers = Array(matrix.size + 1) { IntArray(matrix[0].size + 1) { 0 } }
        for (i in 1..matrix.size) {
            for (j in 1..matrix[0].size) {
                helpers[i][j] =
                    helpers[i][j - 1].xor(helpers[i - 1][j]).xor(helpers[i - 1][j - 1]).xor(matrix[i - 1][j - 1])
                results.add(helpers[i][j])
            }
        }
        results.sortDescending()
        return results[k - 1]
    }
}
