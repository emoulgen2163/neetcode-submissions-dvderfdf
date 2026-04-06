/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(subRoot == null){
            return true
        } else if(root == null){
            return false
        }

        if(sameTree(root, subRoot)){
            return true
        }

        var left = isSubtree(root.left, subRoot)
        var right = isSubtree(root.right, subRoot)
        return left || right
    }

    fun sameTree(leftTree: TreeNode?, rightTree: TreeNode?): Boolean{
        if(leftTree == null && rightTree == null){
            return true
        } else if((leftTree == null || rightTree == null) || (leftTree.`val` != rightTree.`val`)){
            return false
        }

        return sameTree(leftTree.left, rightTree.left) && sameTree(leftTree.right, rightTree.right)
    }
}
