package problem.scrambleString

import core.ISolution

class Solution : ISolution<Pair<String, String>, Boolean> {
    private fun isScramble(s1: String, s2: String): Boolean {
        return false
    }

    override fun run(input: Pair<String, String>): Boolean = isScramble(input.first, input.second)
}
