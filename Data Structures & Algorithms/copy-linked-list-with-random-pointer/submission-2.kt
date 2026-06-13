/*
// Definition for a Node.
class Node(var `val`: Int) {
    var next: Node? = null
    var random: Node? = null
}
*/

class Solution {
    fun copyRandomList(head: Node?): Node? {
        var current = head

        while(current != null){
            val newNode = Node(current.`val`)
            newNode?.next = current.next
            current.next = newNode
            current = newNode?.next
        }

        current = head

        while(current != null){
            if(current.random != null){
                current.next?.random = current.random!!.next
            }

            current = current.next?.next
        }

        current = head
        val newHead = current?.next
        var newCurrent = newHead

        while(current != null){
            current.next = newCurrent?.next
            current = current.next

            if(current != null){
                newCurrent?.next = current.next
                newCurrent = newCurrent?.next
            }
        }

        return newHead
    }
}
