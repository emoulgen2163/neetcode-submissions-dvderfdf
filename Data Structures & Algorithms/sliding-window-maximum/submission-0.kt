class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val indexQueue = ArrayDeque<Int>()
        var result = IntArray(nums.size - k + 1)

        for(i in 0 until k){
            while(indexQueue.isNotEmpty() && nums[indexQueue.last()] <= nums[i]){
                indexQueue.removeLast()
            }

            indexQueue.addLast(i)
        }

        result[0] = nums[indexQueue.first()]

        for (i in k until nums.size) {
            if(indexQueue.first() <= i - k){
                indexQueue.removeFirst()
            }

            while(indexQueue.isNotEmpty() && nums[indexQueue.last()] <= nums[i]){
                indexQueue.removeLast()
            }

            indexQueue.addLast(i)

            result[i - k + 1] = nums[indexQueue.first()]
        }

        return result
    }
}
