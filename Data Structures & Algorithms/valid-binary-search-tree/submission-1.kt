/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isValidBST(root: TreeNode?): Boolean {
        val array = ArrayList<Int?>()

        traverseInOrder(root, array)
        // val first = array[0]
        for(i in 1 until array.size){

            if(array[i]!! <= array[i - 1]!!){
                return false
            }
            
        }

        return true
    }

    fun traverseInOrder(node: TreeNode?, array: ArrayList<Int?>){

        if(node == null){
            return
        }

        traverseInOrder(node.left, array)
        array.add(node.`val`)
        traverseInOrder(node.right, array)

    }
}
