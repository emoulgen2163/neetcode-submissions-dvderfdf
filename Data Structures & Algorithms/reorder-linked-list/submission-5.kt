/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        var long = head
        var short = head

        while(long != null && long.next != null){
            long = long.next?.next
            short = short?.next
        }

        var pivot = short?.next
        short?.next = null

        var prev: ListNode? = null
        var current = pivot

        while(current != null){
            val temp = current.next
            current.next = prev
            prev = current
            current = temp
        }

        var first = head
        var second = prev

        while(first != null && second != null){
            val temp1 = first.next
            val temp2 = second.next

            first.next = second
            second.next = temp1

            first = temp1
            second = temp2

        }
    }
}
