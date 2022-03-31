package problem.problem728

import core.ISolution
/*
https://leetcode-cn.com/problems/self-dividing-numbers/
 */
class Solution : ISolution<Pair<Int, Int>, List<Int>> {
    override fun run(input: Pair<Int, Int>): List<Int> {
        return this.selfDividingNumbers(input.first, input.second)
    }

    private fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        return IntArray(right - left + 1) { i -> left + i }.filter {
            it.toString().map { n -> if (n.digitToInt() == 0) 1 else it.rem(n.digitToInt()) }.sum() == 0
        }
    }
}
