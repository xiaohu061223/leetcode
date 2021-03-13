package problem.letterCombinationsOfAPhoneNumber

/**
 * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */
class Solution {
    private val map = mapOf(
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqrs",
        '8' to "tuv",
        '9' to "wxyz"
    )

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()
        val result = mutableListOf<String>()
        backTrack(digits, 0, charArrayOf(), result)
        return result
    }

    private fun backTrack(digits: String, index: Int, combination: CharArray, result: MutableList<String>) {
        if (index == digits.length) {
            result.add(combination.concatToString())
        } else {
            val letters = map[digits[index]]!!
            letters.forEach {
                val newCombination = combination.plus(it)
                backTrack(digits, index + 1, newCombination, result)
                newCombination.dropLast(0)
            }
        }
    }
}
