/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        var hour: ListNode? = head
        var minute: ListNode? = head

        while(minute != null && minute.next != null){
            minute = minute?.next?.next
            hour = hour?.next
        }

        val second = hour?.next
        hour?.next = null
        var prev: ListNode? = null
        var current = second

        while(current != null){
            val temp = current.next
            current.next = prev
            prev = current

            current = temp
        }

        var firstList: ListNode? = head
        var secondList: ListNode? = prev

        while(firstList != null && secondList != null){
            val temp1 = firstList.next
            val temp2 = secondList.next

            firstList.next = secondList
            secondList.next = temp1

            firstList = temp1
            secondList = temp2

        }
    }
    
}
