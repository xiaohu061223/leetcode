package problem.spiralMatrix

/**
 * https://leetcode-cn.com/problems/spiral-matrix/
 */
class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        return recursion(matrix, 0, matrix.size - 1, 0, matrix[0].size - 1)
    }

    private fun recursion(matrix: Array<IntArray>, mMin: Int, mMax: Int, nMin: Int, nMax: Int): List<Int> {
        if (mMax < mMin || nMax < nMin) return emptyList()
        if (mMax == mMin) return matrix[mMax].copyOfRange(nMin, nMax + 1).toList()
        if (nMax == nMin) {
            val result = mutableListOf<Int>()
            for (i in mMin..mMax) {
                result.add(matrix[i][nMax])
            }
            return result.toList()
        }
        val result = mutableListOf<Int>()
        for (i in nMin until nMax) result.add(matrix[mMin][i])
        for (i in mMin until mMax) result.add(matrix[i][nMax])
        for (i in nMax downTo nMin + 1) result.add(matrix[mMax][i])
        for (i in mMax downTo mMin + 1) result.add(matrix[i][nMin])

        return result + recursion(matrix, mMin + 1, mMax - 1, nMin + 1, nMax - 1)
    }
}
