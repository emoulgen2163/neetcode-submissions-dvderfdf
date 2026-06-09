/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var long = head
        var short = head

        while(long != null && long.next != null){
            long = long?.next?.next
            short = short?.next

            if(long == short) return true
        }

        return false
    }
}
