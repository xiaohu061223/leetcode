package problem.xor.problem342

import core.ISolution

class Solution : ISolution<Int, Boolean> {
    private fun isPowerOfFour(n: Int): Boolean {
        if (n == 1) return true
        if (n < 1) return false
        val binaryStr = Integer.toBinaryString(n)
        return binaryStr[0] == '1' && (n.and(n - 1)) == 0 && (binaryStr.length - 1) % 2 == 0
    }

    override fun run(input: Int): Boolean = isPowerOfFour(input)
}
