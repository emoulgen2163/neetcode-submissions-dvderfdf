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

        traversalInOrder(array, root)

        for(i in array.indices){
            return array[k - 1] ?: 0
        }

        return 0
    }

    fun traversalInOrder(array: ArrayList<Int?>, node: TreeNode?){
        if(node == null) return

        if(node.left != null){
            traversalInOrder(array, node.left)
        }

        array.add(node.`val`)

        if(node.right != null){
            traversalInOrder(array, node.right)
        }
    }
}
