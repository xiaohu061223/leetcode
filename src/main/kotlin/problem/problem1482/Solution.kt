package problem.problem1482

import core.ISolution

/**
 * https://leetcode-cn.com/problems/minimum-number-of-days-to-make-m-bouquets/
 */
class Solution : ISolution<Triple<IntArray, Int, Int>, Int> {

    override fun run(input: Triple<IntArray, Int, Int>): Int = minDays(input.first, input.second, input.third)

    private fun minDays(bloomDays: IntArray, m: Int, k: Int): Int {
        if (m * k > bloomDays.size) return -1
        var right = bloomDays.maxOrNull() ?: Int.MAX_VALUE
        var left = bloomDays.minOrNull() ?: 0
        while (left < right) {
            val mid = left + (right - left) / 2
            if (canMake(bloomDays, m, k, mid)) right = mid else left = mid + 1
        }
        return left
    }

    private fun canMake(bloomDays: IntArray, bouquetSize: Int, neighbours: Int, days: Int): Boolean {
        var realBouquets = 0
        var realNeighbours = 0
        bloomDays.forEach {
            if (it <= days) {
                realNeighbours++
                if (realNeighbours == neighbours) {
                    realNeighbours = 0
                    realBouquets++
                }
            } else {
                realNeighbours = 0
            }
        }
        return realBouquets >= bouquetSize
    }
}
