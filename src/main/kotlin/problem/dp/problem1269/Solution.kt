package problem.dp.problem1269

import core.ISolution

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
        val dpArrays = Array(steps) { LongArray(Math.min(arrLen, steps + 2)) { 0 } }
        dpArrays[0][0] = 1
        dpArrays[0][1] = 1
        repeat(steps - 1) { currentStep ->
            repeat(Math.min(arrLen, steps + 1)) { currentArrLen ->
                val left = if (currentArrLen > 0) dpArrays[currentStep][currentArrLen - 1] else 0
                val right = if (currentArrLen < arrLen - 1) dpArrays[currentStep][currentArrLen + 1] else 0
                dpArrays[currentStep + 1][currentArrLen] = modFunction(
                    dpArrays[currentStep][currentArrLen] + left + right
                )
            }
        }
        return dpArrays[steps - 1][0].toInt()
//        return (dpArrays[steps - 1][0].mod((Math.pow(10.toDouble(), 9.toDouble())).toLong() + 7)).toInt()
    }

    private fun modFunction(target: Long): Long = Math.floorMod(
        target, (Math.pow(10.toDouble(), 9.toDouble()) + 7).toLong()
    )
}
