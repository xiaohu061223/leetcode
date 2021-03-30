package common

/**
 * kotlin link define
 */
class ListNode(val `val`: Int) {
    var next: ListNode? = null
    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass) return false
        other as ListNode
        var current: ListNode? = this
        var currentOther: ListNode? = other
        while (current != null && currentOther != null) {
            if (current.`val` != currentOther.`val`) return false
            current = current.next
            currentOther = currentOther.next
        }
        return true
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }
}
