/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun levelOrder(root: TreeNode?): List<List<Int>> {

        val result = arrayListOf<MutableList<Int>>()

        if(root == null){
            return result
        }

        val queue = ArrayDeque<TreeNode>() 

        queue.add(root)

        while(queue.isNotEmpty()){
            val lists = mutableListOf<Int>()
            
            for(i in queue.indices){
                val node = queue.removeFirst()
                lists.add(node.`val`)

                if(node.left != null) queue.add(node.left)

                if(node?.right != null) queue.add(node.right)
            }

            result.add(lists)
            
        }
        
        return result


    }
}
