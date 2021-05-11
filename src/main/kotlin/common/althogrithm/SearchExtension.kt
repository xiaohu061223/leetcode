package common.althogrithm

internal tailrec fun binarySearch(nums: IntArray, left: Int, right: Int, target: Int): Int {
    val mid = left + (right - left) / 2
    return when {
        left >= right -> -1
        nums[mid] < target -> binarySearch(nums, mid + 1, nums.size - 1, target)
        nums[mid] > target -> binarySearch(nums, 0, mid, target)
        else -> mid
    }
}
