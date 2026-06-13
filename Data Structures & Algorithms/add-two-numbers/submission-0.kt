/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var carry = 0
        val result = ListNode(0)
        var current = result
        
        var list1 = l1
        var list2 = l2

        while(list1 != null || list2 != null || carry != 0){
            val x = list1?.`val` ?: 0
            val y = list2?.`val` ?: 0
            
            val sum = x + y + carry
            carry = sum / 10

            current.next = ListNode(sum % 10)
            current = current.next!!
            
            list1 = list1?.next
            list2 = list2?.next
            
        }


        return result.next
    }
}
