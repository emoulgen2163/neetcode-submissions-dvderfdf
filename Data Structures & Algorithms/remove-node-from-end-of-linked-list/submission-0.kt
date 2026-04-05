/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val answer = ListNode(0)
        answer.next = head

        var left: ListNode? = answer
        var right: ListNode? = answer
        
        var i = 0
        while(i <= n){
            left = left?.next
            i++
        }

        while(left != null){
            left = left.next
            right = right?.next
        }

        right?.next = right?.next?.next

        return answer.next

    }
}
