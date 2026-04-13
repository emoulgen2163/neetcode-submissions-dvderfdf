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

        var left = dfs(root.left)
        var right = dfs(root.right)

        var leftMax = max(left, 0)
        var rightMax = max(right, 0)

        val sum = root.`val` + leftMax + rightMax

        result = max(result, sum)

        return root.`val` + max(leftMax, rightMax)
    }
}
