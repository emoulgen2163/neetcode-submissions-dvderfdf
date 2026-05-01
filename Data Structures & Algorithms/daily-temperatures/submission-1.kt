class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val cache = Stack<Int>()
        val result = IntArray(temperatures.size)

        for(i in temperatures.indices){
            while(cache.isNotEmpty() && temperatures[i] > temperatures[cache.peek()]){
                val pop = cache.pop()
                result[pop] = i - pop
            }

            cache.push(i)
        }

        return result
    }
}
