package implementQueueUsingStacks

class MyQueueWithList {

    private val stack1 = mutableListOf<Int>()
    private val stack2 = mutableListOf<Int>()

    fun push(x: Int) {
        stack1.add(x)
    }

    fun pop(): Int {

        if (stack2.isEmpty()) {
            while (stack1.isNotEmpty()) stack2.add(stack1.removeAt(stack1.lastIndex))
        }
        return stack2.removeAt(stack2.lastIndex)
    }

    fun peek(): Int {
        if (stack2.isEmpty()) {
            while (stack1.isNotEmpty()) stack2.add(stack1.removeAt(stack1.lastIndex))
        }
        return stack2[(stack2.lastIndex)]
    }

    fun empty(): Boolean = stack1.isEmpty() && stack2.isEmpty()


}
