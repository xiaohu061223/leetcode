package problem.removeDuplicates

class Solution {

    fun removeDuplicates(S: String): String {
        val stack = mutableListOf<Char>()
        S.forEach {
            if (stack.isNotEmpty() && stack.last() == it) stack.removeAt(stack.lastIndex) else stack.add(it)
        }
        return stack.joinToString("")
    }
}
