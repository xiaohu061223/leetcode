package problem.generateParentheses


class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()
        recursion("", result, n)
        return result.toList()
    }

    private fun recursion(current: String, result: MutableList<String>, n: Int) {
        if (current.length == n * 2) {
            result.add(current)
            return
        }
        if (current.sizeOfChar('(') < n) recursion("$current(", result, n)
        if (current.sizeOfChar('(') > current.sizeOfChar(')'))
            recursion("$current)", result, n)
    }

    private fun String.sizeOfChar(char: Char): Int = this.filter { it == char }.length
}

