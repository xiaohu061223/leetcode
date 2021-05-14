package problem.dp.problem1269

import core.ISolution
import kotlin.math.pow

/** 当在length = arrLen时，
 *  step👉的数量 = step👈的数量
 *  dpArrays[0][currentIndex] 表示在剩余step为1的时候在currentIndex时，总的方案数量
 *  dpArrays[restStep-1][currentIndex] = dpArrays[restStep-2][currentIndex] +
 *                                       dpArrays[restStep-2][currentIndex-1] +
 *                                       dpArrays[restStep-2[currentIndex+1]
 *
 */
class Solution : ISolution<Pair<Int, Int>, Int> {
    override fun run(input: Pair<Int, Int>): Int = numWays(input.first, input.second)

    private fun numWays(steps: Int, arrLen: Int): Int {
        val dpArrays = Array(steps) { LongArray(minOf(arrLen, steps + 2)) { 0 } }
        dpArrays[0][0] = 1
        dpArrays[0][1] = 1
        repeat(steps - 1) { currentStep ->
            repeat(minOf(arrLen, steps + 1)) { currentArrLen ->
                val left = if (currentArrLen > 0) dpArrays[currentStep][currentArrLen - 1] else 0
                val right = if (currentArrLen < arrLen - 1) dpArrays[currentStep][currentArrLen + 1] else 0
                dpArrays[currentStep + 1][currentArrLen] = (
                        dpArrays[currentStep][currentArrLen] + left + right
                        ).mod((10.toDouble().pow(9.toDouble()) + 7).toLong())
            }
        }
        return dpArrays[steps - 1][0].toInt()
    }

}
