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

        var count = 0
        while(count <= n){
            right = right?.next
            count++
        }

        while(right != null){
            left = left?.next
            right = right?.next
        }

        left?.next = left?.next?.next

        return answer.next
    }
}
