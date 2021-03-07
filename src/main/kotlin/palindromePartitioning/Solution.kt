package palindromePartitioning

class Solution {
    fun partition(s: String): List<List<String>> {
        if (s.isEmpty()) return emptyList()
        val result = mutableListOf<List<String>>()
        recursion(s, mutableListOf(), result)
        return result
    }

    private fun recursion(
        s: String,
        currentPath: MutableList<String>,
        result: MutableList<List<String>>,
    ) {
        if (s.isEmpty()) result.add(currentPath.toList())
        else for (i in 1 until s.length + 1) {
            if (isPalindrome(s.substring(0, i))) {
                currentPath.add(s.substring(0, i))
                recursion(s.drop(i), currentPath, result)
                currentPath.removeLast()
            }
        }
    }

    private fun isPalindrome(s: String): Boolean {
        if (s.isEmpty()) return false
        var left = 0
        var right = s.length - 1
        while (left < right) {
            if (s[left] != s[right]) return false
            left++
            right--
        }
        return true
    }
}
