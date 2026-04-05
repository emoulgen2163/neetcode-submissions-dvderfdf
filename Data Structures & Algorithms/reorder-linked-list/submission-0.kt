/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reorderList(head: ListNode?) {
        if (head == null || head.next == null) return

        var slow: ListNode? = head
        var fast: ListNode? = head.next
        while (fast != null && fast?.next != null) {
            slow = slow?.next
            fast = fast?.next?.next
        }

        var preMiddle = slow
        var preCurrent = slow?.next

        while (preCurrent?.next != null) {
            var current = preCurrent?.next
            preCurrent?.next = current?.next
            current?.next = preMiddle?.next
            preMiddle?.next = current
        }

        slow = head
        fast = preMiddle?.next
        while (slow != preMiddle!!) {
            preMiddle?.next = fast?.next
            fast?.next = slow?.next
            slow?.next = fast
            slow = fast?.next
            fast = preMiddle?.next
        }
    }
}