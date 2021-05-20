package problem.problem692

import core.ISolution
import core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Array<String>, Int>, List<String>>() {
    override val solutions: List<ISolution<Pair<Array<String>, Int>, List<String>>> = listOf(Solution())
    override val testCases: List<Pair<Pair<Array<String>, Int>, List<String>>> = listOf(
        arrayOf("i", "love", "leetcode", "i", "love", "coding") to 2 to listOf("i", "love"),
        arrayOf(
            "the",
            "day",
            "is",
            "sunny",
            "the",
            "the",
            "the",
            "sunny",
            "is",
            "is",
        ) to 4 to listOf("the", "is", "sunny", "day"),
        )
}

