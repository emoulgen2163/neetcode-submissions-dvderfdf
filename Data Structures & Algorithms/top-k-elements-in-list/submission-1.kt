class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val frequencyMap = hashMapOf<Int, Int>()
        val bucket = MutableList<MutableList<Int>>(nums.size + 1){ mutableListOf() }
        val result = IntArray(k)
        var counter = 0

        for (i in nums){
            frequencyMap[i] = 1 + (frequencyMap[i] ?: 0)
        }

        for (key in frequencyMap.keys){
            val frequency = frequencyMap[key]!!
            bucket[frequency].add(key)
        }

        for (pos in bucket.size - 1 downTo 0){
            if (counter < k){
                for (i in bucket[pos]){
                    result[counter++] = i
                }
            }
        }

        return result
    }
}
