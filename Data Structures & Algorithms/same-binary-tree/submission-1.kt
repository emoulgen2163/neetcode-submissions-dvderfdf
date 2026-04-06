/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if(p == null && q == null){
            return true
        } else if((p == null || q == null) || (p.`val` != q.`val`)){
            return false
        }

        var left = isSameTree(p.left, q.left)
        var right = isSameTree(p.right, q.right)

        return left && right
    }
}
