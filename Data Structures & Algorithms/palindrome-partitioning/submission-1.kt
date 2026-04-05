class Solution {
    fun partition(s: String): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val partitioned = mutableListOf<String>()

        fun partitionBacktracking(s: String, partitioned: MutableList<String>, result: MutableList<List<String>>){

            if (s.isEmpty() && partitioned.isNotEmpty()){
                result.add(partitioned.toList())
            }

            for (i in 1 .. s.length){
                val segment = s.substring(0, i)

                if (segment == segment.reversed()){
                    partitioned.add(segment)
                    partitionBacktracking(s.substring(i), partitioned, result)
                    partitioned.removeLast()
                }
            }
        }

        partitionBacktracking(s, partitioned, result)

        return result
    }
}
