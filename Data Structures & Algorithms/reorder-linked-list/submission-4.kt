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
            long = long?.next?.next
            short = short?.next
        }

        var mid = short?.next
        short?.next = null

        var prev: ListNode? = null
        var current = mid

        while(current != null){
            val temp = current.next
            current.next = prev
            prev = current
            current = temp
        }

        var firstHead = head
        var secondHead = prev

        while(firstHead != null && secondHead != null){
            val temp1 = firstHead.next
            val temp2 = secondHead.next

            firstHead.next = secondHead
            secondHead.next = temp1

            firstHead = temp1
            secondHead = temp2
        }
    }
}
