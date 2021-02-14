```kotlin
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2
        if (l2 == null) return l1
        return calcNumber(l1, l2)
    }

    private fun calcNumber(l1: ListNode, l2: ListNode): ListNode {
        val listA = reverseLink(l1)
        val listB = reverseLink(l2)
        val smallSize = if (listA.size < listB.size) listA.size else listB.size
        val restList = if (listA.size < listB.size) listB.copyOfRange(smallSize, listB.size) else
            listA.copyOfRange(smallSize, listA.size)
        var needPlusOne = 0
        val head = ListNode(-1)
        var pre: ListNode? = null
        for (index in 0 until smallSize) {
            val sums = listA[index] + listB[index] + needPlusOne
            val newNode = ListNode(sums % 10)
            if (head.`val` == -1) {
                head.`val` = newNode.`val`
                pre = head
            } else {
                pre!!.next = newNode
                pre = pre.next
            }
            needPlusOne = if (sums >= 10) 1 else 0
        }
        //rest
        restList.forEach {
            val sums = it + needPlusOne
            pre!!.next = ListNode(sums % 10)
            needPlusOne = if (sums >= 10) 1 else 0
            pre = pre!!.next
        }
        if (needPlusOne == 1) {
            pre!!.next = ListNode(1)
        }
        return head
    }

    private fun reverseLink(list: ListNode): IntArray {
        return if (list.next == null) intArrayOf(list.`val`)
        else intArrayOf(list.`val`) + reverseLink(list.next!!)
    }

}
```
