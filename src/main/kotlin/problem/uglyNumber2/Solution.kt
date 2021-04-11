package problem.uglyNumber2

import core.ISolution

class Solution : ISolution<Int, Int> {
    override fun run(input: Int): Int = nthNumber(input)

    private fun nthNumber(n: Int): Int {
        val uglyNumbers = MutableList(n) { 1 }
        var p0 = 0
        var p1 = 0
        var p2 = 0
        repeat(n - 1) {
            val a = uglyNumbers[p0] * 2
            val b = uglyNumbers[p1] * 3
            val c = uglyNumbers[p2] * 5
            uglyNumbers[it + 1] = minOf(a, b, c)
            if (uglyNumbers[it + 1] == a) p0++
            if (uglyNumbers[it + 1] == b) p1++
            if (uglyNumbers[it + 1] == c) p2++
        }
        return uglyNumbers[n - 1]
    }
}
