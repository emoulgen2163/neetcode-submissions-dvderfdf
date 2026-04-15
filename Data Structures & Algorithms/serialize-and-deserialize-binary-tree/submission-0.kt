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

        var result = ArrayList<String>()

        val queue = LinkedList<TreeNode?>()
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
        if (data.isEmpty()) return null

        val parts = data.split(",")

        val root = TreeNode(parts[0].toInt())
        val queue = LinkedList<TreeNode>()
        queue.add(root)

        var i = 1

        while (queue.isNotEmpty() && i < parts.size) {
            val parent = queue.removeFirst()

            // Left child
            if (parts[i] != "N") {
                val left = TreeNode(parts[i].toInt())
                parent.left = left
                queue.add(left)
            }
            i++

            // Right child
            if (i < parts.size && parts[i] != "N") {
                val right = TreeNode(parts[i].toInt())
                parent.right = right
                queue.add(right)
            }
            i++
        }

        return root
    }
}