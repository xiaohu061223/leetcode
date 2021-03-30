package problem.isValidSerialization

class Solution {
    fun isValidSerialization(preorder: String): Boolean {
        return recursion(preorder.split(",").toMutableList())
    }

    private fun recursion(stack: MutableList<String>): Boolean {
        if (stack.size == 1 && stack[0] == "#") return true
        val restStack = mutableListOf<String>()
        while (stack.size >= 3) {
            val third = stack.removeAt(stack.lastIndex)
            val second = stack.removeAt(stack.lastIndex)
            val first = stack.removeAt(stack.lastIndex)
            if (third == second && second == "#" && first != "#") {
                stack.add("#")
                while (restStack.isNotEmpty()) stack.add(restStack.removeAt(restStack.lastIndex))
                return recursion(stack)
            }
            stack.add(first)
            stack.add(second)
            restStack.add(third)
        }
        return false
    }
}
