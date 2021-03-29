package problem.reverseBits

import core.ISolution

class Solution : ISolution<Int, Int> {
    // you need treat n as an unsigned value
    private fun reverseBits(n: Int): Int {
        var rev = 0
        repeat(32) {
            val t = n.shr(it).and(1)
            if (t == 1) rev = rev.or(1.shl(31 - it))
        }
        return rev
    }

    override fun run(input: Int): Int = reverseBits(input)
}
