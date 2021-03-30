package problem.searchMatrix

import core.ISolution

class Solution : ISolution<Pair<Array<IntArray>, Int>, Boolean> {
    private fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        return dfs(matrix, target)
    }

    private fun dfs(matrix: Array<IntArray>, target: Int): Boolean {
        val midRow = matrix.size / 2
        if (midRow < 0) return false
        if (midRow == 0) {
            return binarySearch(matrix[midRow], target)
        }
        if (matrix.last().last() < target) return false
        return when {
            matrix[midRow][0] > target -> dfs(matrix.copyOfRange(0, midRow), target)
            matrix[midRow][0] == target -> true
            matrix[midRow][0] < target -> {
                return when {
                    matrix[midRow].last() < target -> dfs(matrix.copyOfRange(midRow + 1, matrix.size), target)
                    matrix[midRow].last() == target -> true
                    matrix[midRow].last() > target -> binarySearch(matrix[midRow], target)
                    else -> false
                }
            }
            else -> false
        }
    }

    private fun binarySearch(intArray: IntArray, target: Int): Boolean = intArray.any { it == target }

    override fun run(input: Pair<Array<IntArray>, Int>) = searchMatrix(input.first, input.second)
}
