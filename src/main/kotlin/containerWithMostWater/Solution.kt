package containerWithMostWater

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点(i,ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为i,ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 */
class Solution {
    fun maxArea(height: IntArray): Int {
        var start = 0
        var end = height.size - 1
        var maxArea = 0
        while (start < end) {
            val area = (end - start) * height[start].coerceAtMost(height[end])
            maxArea = area.coerceAtLeast(maxArea)
            when {
                height[start] < height[end] -> start++
                else -> end--
            }
        }
        return maxArea
    }
}
