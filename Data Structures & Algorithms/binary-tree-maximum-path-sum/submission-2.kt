/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var result = Int.MIN_VALUE

    fun maxPathSum(root: TreeNode?): Int {
        dfs(root)
        return result
    }

    fun dfs(root: TreeNode?): Int{
        if(root == null){
            return 0
        }

        val leftMax = max(dfs(root.left), 0)
        val rightMax = max(dfs(root.right), 0)

        result = max(result, root.`val` + leftMax + rightMax)

        return root.`val` + max(leftMax, rightMax)

    }
}
