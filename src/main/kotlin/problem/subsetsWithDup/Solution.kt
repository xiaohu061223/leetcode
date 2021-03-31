package problem.subsetsWithDup

import core.ISolution

class Solution : ISolution<IntArray, Set<List<Int>>> {
    private fun subsetsWithDup(nums: IntArray): Set<List<Int>> {
        nums.sort()
        val result = mutableSetOf<List<Int>>()
        dfs(nums, 0, mutableListOf(), result)
        return result
    }

    private fun dfs(nums: IntArray, index: Int, path: MutableList<Int>, result: MutableSet<List<Int>>) {
        result.add(path.toList())
        for (i in index until nums.size) {
            if (i != index && nums[i] == nums[i - 1]) {
                continue
            }
            path.add(nums[i])
            dfs(nums, i + 1, path, result)
            path.removeAt(path.lastIndex)
        }
    }

    override fun run(input: IntArray): Set<List<Int>> = subsetsWithDup(input)
}
