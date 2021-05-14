package problem.problem12

import core.ISolution

class Solution : ISolution<Int, String> {
    override fun run(input: Int): String = intToRoman(input)

    private fun intToRoman(num: Int): String = when {
        num >= 1000 -> "M".repeat(num / 1000) + intToRoman(num - (num / 1000) * 1000)
        num >= 900 -> "CM" + intToRoman(num - 900)
        num >= 500 -> "D" + "C".repeat((num - 500) / 100) + intToRoman(num - (num / 100) * 100)
        num >= 400 -> "CD" + intToRoman(num - 400)
        num >= 100 -> "C".repeat(num / 100) + intToRoman(num - (num / 100) * 100)
        num >= 90 -> "XC" + intToRoman(num - 90)
        num >= 50 -> "L" + "X".repeat((num - 50) / 10) + intToRoman(num - (num) / 10 * 10)
        num >= 40 -> "XL" + intToRoman(num - 40)
        num >= 10 -> "X".repeat(num / 10) + intToRoman(num - (num / 10) * 10)
        num >= 9 -> "IX"
        num >= 5 -> "V" + "I".repeat(num - 5)
        num >= 4 -> "IV"
        else -> "I".repeat(num)
    }
}
