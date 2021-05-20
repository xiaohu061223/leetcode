package problem.problem692

import core.ISolution

/**
 * https://leetcode-cn.com/problems/top-k-frequent-words/
 * 尝试以 O(n log k) 时间复杂度和 O(n) 空间复杂度解决。
 *
 */
class Solution : ISolution<Pair<Array<String>, Int>, List<String>> {
    override fun run(input: Pair<Array<String>, Int>): List<String> = topKFrequent(input.first, input.second)

    private fun topKFrequent(words: Array<String>, k: Int): List<String> {
        val wordsCountHash = mutableMapOf<String, Int>()
        words.forEach {
            wordsCountHash[it] = (wordsCountHash[it] ?: 0) + 1
        }
        return wordsCountHash.toList()
            .sortedWith { o1, o2 ->
                if (o1.second == o2.second) o1.first.compareTo(o2.first) else o2.second - o1.second
            }.take(k).map { it.first }
    }
}
