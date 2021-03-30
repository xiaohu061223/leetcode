package problem.calculate

class Solution {
    private val OP_MAPS = mapOf(
        '*' to 2,
        '/' to 2,
        '+' to 1,
        '-' to 1,
    )

    fun calculate(s: String): Int {
        if (s.length < 2) return s.toInt()
        val suffixExpression = toSuffixExpresion(optimize(s))
        return calSuffix(suffixExpression)
    }

    private fun optimize(s: String) =
        (if (s.startsWith("-")) "0$s" else s)
            .replace("(-", "(0-")
            .replace(" ", "")

    private fun toSuffixExpresion(s: String): List<String> {
        val expression = mutableListOf<String>()
        val operations = mutableListOf<Char>()
        var nums = 0
        s.forEachIndexed { index, c ->
            when {
                c.isDigit() -> {
                    nums = nums * 10 + c.toInt() - '0'.toInt()
                }
                c == '(' -> {
                    if (index > 0 && s[index - 1].isDigit()) expression.add(nums.toString())
                    nums = 0
                    operations.add(c)
                }
                c == ')' -> {
                    if (s[index - 1].isDigit()) expression.add(nums.toString())
                    nums = 0
                    while (operations.last() != '(')
                        expression.add(operations.removeAt(operations.lastIndex).toString())
                    operations.removeAt(operations.lastIndex)
                }
                OP_MAPS.containsKey(c) -> {
                    if (s[index - 1].isDigit()) expression.add(nums.toString())
                    nums = 0
                    while (operations.isNotEmpty() && OP_MAPS[operations.last()] ?: 0 >= OP_MAPS[c]!!) {
                        expression.add(operations.removeAt(operations.lastIndex).toString())
                    }
                    operations.add(c)
                }
            }
        }
        if (s.last().isDigit()) expression.add(nums.toString())
        while (operations.isNotEmpty()) expression.add(operations.removeAt(operations.lastIndex).toString())
        return expression.toList()
    }

    private fun calSuffix(exp: List<String>): Int {
        val numbers = mutableListOf<Int>()
        for (c in exp) {
            if (!OP_MAPS.containsKey(c[0])) numbers.add(c.toInt())
            else {
                val first = numbers.removeAt(numbers.lastIndex)
                val second = numbers.removeAt(numbers.lastIndex)
                numbers.add(doCal(second, first, c[0]))
            }
        }
        return numbers.first()
    }

    private fun doCal(first: Int, second: Int, operation: Char): Int {
        return when (operation) {
            '+' -> first + second
            '-' -> first - second
            '*' -> first * second
            '/' -> first / second
            else -> 0
        }
    }
}
