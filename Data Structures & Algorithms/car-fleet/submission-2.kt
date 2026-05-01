class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val posMap = hashMapOf<Int, Int>()

        for (i in position.indices) {
            posMap[position[i]] = speed[i]
        }
        
        val sortedDesc = posMap.toSortedMap(compareByDescending { it })
        
        val cache = Stack<Double>()

        for (i in sortedDesc.keys) {
            val time = (target - i).toDouble() / sortedDesc[i]!!
            if (cache.isEmpty() || time > cache.peek()) {
                cache.push(time)
            }
        }

        
        return cache.size
    }
}
