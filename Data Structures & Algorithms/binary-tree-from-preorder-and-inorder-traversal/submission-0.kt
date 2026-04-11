/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        val inOrderMap = hashMapOf<Int, Int>()

        for(i in inorder.indices){
            inOrderMap[inorder[i]] = i
        }

        return splitTree(preorder, inOrderMap, 0, 0, inorder.size - 1)
    }

    fun splitTree(preorder: IntArray, inOrderMap: HashMap<Int, Int>, rootIndex: Int, left: Int, right: Int): TreeNode?{
        val root = TreeNode(preorder[rootIndex])

        val mid = inOrderMap[preorder[rootIndex]]

        if(mid!! > left){
            root.left = splitTree(preorder, inOrderMap, rootIndex + 1, left, mid - 1)
        } 
        if (mid!! < right){
            val rightMid = rootIndex + (mid - left) + 1
            root.right = splitTree(preorder, inOrderMap, rightMid, mid + 1, right)
        }

        return root
    }
}
