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
        traverseInOrder(array, root)
        
        for(i in 1 until array.size){
            if(array[i]!! <= array[i - 1]!!){
                return false
            }
        }

        return true
    }

    fun traverseInOrder(array: ArrayList<Int?>, node: TreeNode?){

        if(node == null) return

        if(node.left != null){
            traverseInOrder(array, node.left)
        }

        array.add(node.`val`)
        if(node.right != null){
            traverseInOrder(array, node.right)
        }
    }
}
