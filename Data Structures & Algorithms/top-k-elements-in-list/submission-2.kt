class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap = hashMapOf<Int, Int>()
        val bucket = MutableList<MutableList<Int>>(nums.size + 1){ mutableListOf() }
        val result = IntArray(k)
        var counter = 0

        for(i in nums){
            frequencyMap[i] = 1 + (frequencyMap[i] ?: 0)
        }

        for(key in frequencyMap.keys){
            bucket[frequencyMap[key]!!].add(key)
        }

        for (i in bucket.size - 1 downTo 0) {
            val currentArray = bucket[i]
            if(counter < k){
                for (pos in currentArray) {
                    result[counter++] = pos
                }
            }
        }

        return result
    }
}
