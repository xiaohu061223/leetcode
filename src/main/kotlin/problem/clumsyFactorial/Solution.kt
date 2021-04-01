package problem.clumsyFactorial

import core.ISolution

class Solution : ISolution<Int, Int> {
    private fun clumsy(N: Int): Int = when (N) {
        0 -> 0
        1 -> 1
        2 -> 2
        3 -> 6
        else -> N * (N - 1) / (N - 2) + (N - 3) + dfs(N - 4)
    }

    private fun dfs(N: Int): Int = when (N) {
        0 -> 0
        1 -> -1
        2 -> -2
        3 -> -6
        else -> -(N) * (N - 1) / (N - 2) + (N - 3) + dfs(N - 4)
    }

    override fun run(input: Int): Int = clumsy(input)
}
