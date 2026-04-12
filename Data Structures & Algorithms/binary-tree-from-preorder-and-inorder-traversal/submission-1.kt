/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        val inorderMap = hashMapOf<Int, Int>()

        for(i in inorder.indices){
            inorderMap[inorder[i]] = i
        }

        return splitTree(preorder, inorder, inorderMap, 0, 0, inorder.size - 1)

    }

    fun splitTree(preorder: IntArray, inorder: IntArray, inorderMap: HashMap<Int, Int>, rootIndex: Int, left: Int, right: Int): TreeNode?{
        val root = TreeNode(preorder[rootIndex])

        if(root == null) return null

        val mid = inorderMap[preorder[rootIndex]]!!


        if(mid > left){
            root.left = splitTree(preorder, inorder, inorderMap, rootIndex + 1, left, mid - 1)
        }

        if(mid < right){
            val rightRootIndex = rootIndex + (mid - left) + 1
            root.right = splitTree(preorder, inorder, inorderMap, rightRootIndex, mid + 1, right)
        }

        return root
    }
}
