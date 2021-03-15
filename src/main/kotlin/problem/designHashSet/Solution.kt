package problem.designHashSet

class Solution {
    private val array = MutableList<Node?>(131072) { null }
    fun add(key: Int) {
        val pos = hash(key)
        if (array[pos] == null) {
            array[pos] = Node(key)
        } else {
            var current = array[pos]
            if (current?.value == key) return
            while (current?.next != null) {
                current = current.next
                if (current?.value == key) return
            }
            current?.next = Node(key)
        }
    }

    fun remove(key: Int) {
        val pos = hash(key)
        if (array[pos] == null) return
        else {
            var current = array[pos]
            if (current?.value == key) {
                array[pos] = current.next
                return
            }
            var before = array[pos]
            while (current != null) {
                if (current.value == key) {
                    before?.next = current.next
                    return
                }
            }
        }
    }

    fun contains(key: Int): Boolean {
        val pos = hash(key)
        if (array[pos] == null) {
            return false
        } else {
            var current = array[pos]
            while (current != null) {
                if (current.value == key) return true
                current = current.next
            }
        }
        return false
    }

    private fun hash(key: Int) = key % (131072)

    class Node(
        val value: Int,
        var next: Node? = null,
    )
}
