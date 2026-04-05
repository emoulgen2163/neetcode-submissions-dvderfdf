/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = head

        while(current != null){
            val temp = current.next
            current.next = prev
            prev = current

            current = temp
        }

        return prev
    }
}
