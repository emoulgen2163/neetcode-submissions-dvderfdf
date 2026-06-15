/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val result = ListNode(0)
        var current = result
        var carry = 0

        var l1 = l1
        var l2 = l2

        while(l1 != null || l2 != null || carry != 0){
            val x = l1?.`val` ?: 0
            val y = l2?.`val` ?: 0

            val sum = x + y + carry
            carry = sum / 10

            current?.next = ListNode(sum % 10)
            current = current.next!!

            l1 = l1?.next
            l2 = l2?.next
        }

        return result.next
    }
}
