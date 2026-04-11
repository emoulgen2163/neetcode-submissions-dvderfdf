/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val array = ArrayList<Int?>()
        inOrderTraversal(array, root)

        return array[k - 1] ?: 0
    }

    fun inOrderTraversal(array: ArrayList<Int?>, node: TreeNode?){
        if(node == null) return

        inOrderTraversal(array, node.left)
        array.add(node.`val`)
        inOrderTraversal(array, node.right)
    }
}
