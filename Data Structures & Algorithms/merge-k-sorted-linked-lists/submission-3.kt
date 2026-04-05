/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if(lists.isEmpty()){
            return null
        }

        for(i in 1 until lists.size){
            lists[i] = mergeTwoLinkedLists(lists[i], lists[i - 1])
        }

        return lists[lists.size - 1]
    }

    fun mergeTwoLinkedLists(l1: ListNode?, l2: ListNode?): ListNode?{
        val answer = ListNode(0)
        var current: ListNode? = answer

        var l1 = l1
        var l2 = l2

        while(l1 != null && l2 != null){
            if(l1.`val` < l2.`val`){
                current?.next = l1
                l1 = l1.next
            } else{
                current?.next = l2
                l2 = l2.next
            }

            current = current?.next
        }

        current?.next = l1 ?: l2

        return answer.next

    }
}
