/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var hourHand = head
        var minuteHand = head

        while(minuteHand != null && minuteHand.next != null){
            minuteHand = minuteHand.next?.next
            hourHand = hourHand?.next

            if(hourHand == minuteHand){
                return true
            }
        }

        return false
    }
}
