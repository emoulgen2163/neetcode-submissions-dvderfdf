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

        val left = dfs(root.left)
        val right = dfs(root.right)

        val leftMax = max(left, 0)
        val rightMax = max(right, 0)

        val sum = root.`val` + leftMax + rightMax

        result = max(result, sum)

        return root.`val` + max(leftMax, rightMax)
    }
}
