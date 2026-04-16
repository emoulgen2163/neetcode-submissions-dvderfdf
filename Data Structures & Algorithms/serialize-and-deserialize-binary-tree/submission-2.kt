/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Codec {
    // Encodes a tree to a single string.
    fun serialize(root: TreeNode?): String {
        if(root == null) return ""

        val result = ArrayList<String>()

        val queue = ArrayList<TreeNode?>()
        queue.add(root)

        while(queue.isNotEmpty()){
            val node = queue.removeFirst()

            if(node == null){
                result.add("N")
            } else{
                result.add("${node.`val`}")
                queue.add(node.left)
                queue.add(node.right)
            }  
        }

        return result.joinToString(",")
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        if(data.isEmpty()) return null

        val parts = data.split(",")
        val root = TreeNode(parts[0].toInt())

        val queue = ArrayList<TreeNode>()
        queue.add(root)

        var i = 1

        while(queue.isNotEmpty() && i < parts.size){
            val parent = queue.removeFirst()

            if(i < parts.size && parts[i] != "N"){
                parent.left = TreeNode(parts[i].toInt())
                queue.add(parent.left!!)
            }

            i++

            if(i < parts.size && parts[i] != "N"){
                parent.right = TreeNode(parts[i].toInt())
                queue.add(parent.right!!)
            }

            i++
        }

        return root
    }
}
