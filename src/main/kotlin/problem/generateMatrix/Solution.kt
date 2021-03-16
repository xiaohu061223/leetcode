package problem.generateMatrix

class Solution {
    fun generateMatrix(n: Int): Array<IntArray> {
        val result = Array(n) { IntArray(n) }
        var nums = 1
        var columnLength = n
        var x = 0
        var y = -1
        while (columnLength > 0) {
            repeat(columnLength--) { result[x][++y] = nums++ }
            repeat(columnLength) { result[++x][y] = nums++ }
            repeat(columnLength--) { result[x][--y] = nums++ }
            repeat(columnLength) { result[--x][y] = nums++ }
        }
        return result
    }
}
