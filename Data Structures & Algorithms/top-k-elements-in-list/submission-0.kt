class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap = hashMapOf<Int, Int>()
        val bucket = MutableList<MutableList<Int>>(nums.size + 1){ mutableListOf() }
        val result = MutableList(k){ 0 }
        var counter = 0

        for (i in nums){
            frequencyMap[i] = 1 + (frequencyMap[i] ?: 0)
        }

        for (key in frequencyMap.keys){
            val frequency = frequencyMap[key]!!
            if (bucket[frequency] == null){
                bucket[frequency] = mutableListOf()
            }

            bucket[frequency].add(key)
        }

        for (pos in bucket.size - 1 downTo 0){
            if (counter < k && bucket[pos] != null){
                for (i in bucket[pos]){
                    result[counter++] = i
                }
            }
        }

        return result.toIntArray()
    }
}
