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

    fun dfs(node: TreeNode?): Int{
        if(node == null){
            return 0
        }

        val leftDfs = dfs(node.left)
        val rightDfs = dfs(node.right)

        val leftMax = max(leftDfs, 0)
        val rightMax = max(rightDfs, 0)

        val sum = node.`val` + leftMax + rightMax

        result = max(result, sum)

        return node.`val` + max(leftMax, rightMax)
    }
}
