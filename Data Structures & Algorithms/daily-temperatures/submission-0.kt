class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        var result = IntArray(temperatures.size){ 0 }
        val cache = Stack<Int>()

        for(i in temperatures.indices){
            while(cache.isNotEmpty() && temperatures[i] > temperatures[cache.peek()]){
                val top = cache.pop()
                val difference = i - top
                result[top] = difference
            }

            cache.push(i)
        }

        return result
    }
}
