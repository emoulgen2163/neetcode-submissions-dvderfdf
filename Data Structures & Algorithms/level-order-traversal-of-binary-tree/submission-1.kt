/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val result = arrayListOf<ArrayList<Int>>()

        if(root == null){
            return result
        }

        val queue = ArrayList<TreeNode?>()

        queue.add(root)

        while(queue.isNotEmpty()){
            val nodes = arrayListOf<Int>()
            for(i in queue.indices){
                val node = queue.removeFirst()

                nodes.add(node!!.`val`)

                if(node?.left != null){
                    queue.add(node.left)
                } 
                
                if(node?.right != null){
                    queue.add(node.right)
                }
            }

            result.add(nodes)
        }

        return result
    }
}
