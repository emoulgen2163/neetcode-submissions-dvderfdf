/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if(preorder.isEmpty() || inorder.isEmpty()){
            return null
        }

        val root = TreeNode(preorder[0])
        val mid = inorder.indexOf(preorder[0])
        

        root.left = buildTree(preorder.toList().subList(1, mid + 1).toIntArray(), inorder.toList().subList(0, mid).toIntArray())
        root.right = buildTree(preorder.toList().subList(mid + 1, preorder.size).toIntArray(), inorder.toList().subList(mid + 1, inorder.size).toIntArray())

        return root

    }
}
