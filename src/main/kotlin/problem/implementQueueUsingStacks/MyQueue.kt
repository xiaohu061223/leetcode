package problem.implementQueueUsingStacks

import common.peek
import common.pop
import common.push
import common.stackOf

/**
 * 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列的支持的所有操作（push、pop、peek、empty）：
 * 实现 MyQueue 类：
 * void push(int x) 将元素 x 推到队列的末尾
 * int pop() 从队列的开头移除并返回元素
 * int peek() 返回队列开头的元素
 * boolean empty() 如果队列为空，返回 true ；否则，返回 false
 */
class MyQueue() {
    private val stack1 = stackOf<Int>()
    private val stack2 = stackOf<Int>()

    fun push(x: Int) {
        stack1.push(x)
    }

    fun pop(): Int {
        while (stack1.isNotEmpty()) stack2.push(stack1.pop()!!)
        val value = stack2.pop()!!
        while (stack2.isNotEmpty()) stack1.push(stack2.pop()!!)
        return value
    }

    fun peek(): Int {
        while (stack1.isNotEmpty()) stack2.push(stack1.pop()!!)
        val value = stack2.peek()!!
        while (stack2.isNotEmpty()) stack1.push(stack2.pop()!!)
        return value
    }

    fun empty(): Boolean = stack1.isEmpty() && stack2.isEmpty()
}
