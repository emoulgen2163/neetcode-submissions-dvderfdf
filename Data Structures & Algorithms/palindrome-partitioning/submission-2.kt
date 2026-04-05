class Solution {
    fun partition(s: String): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val partitioned = mutableListOf<String>()

        fun backTrack(s: String, result: MutableList<List<String>>, partitioned: MutableList<String>){
            if(s.isEmpty() && partitioned.isNotEmpty()){
                result.add(partitioned.toList())
            }

            for(i in 1 .. s.length){
                val segment = s.substring(0, i)
                if(segment == segment.reversed()){
                    partitioned.add(segment)
                    backTrack(s.substring(i), result, partitioned)
                    partitioned.removeLast()
                }
            }
        }

        backTrack(s, result, partitioned)
        
        return result 
    }
}
