/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {

        if(root == null){
            return null
        }

        var left = invertTree(root?.left)
        var right = invertTree(root?.right)

        root?.left = right
        root?.right = left

        return root
    }
}
