class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val output = IntArray(nums.size - k + 1)
        val queue = ArrayDeque<Int>()

        for(i in 0 until k){
            while(queue.isNotEmpty() && nums[queue.last()] <= nums[i]){
                queue.removeLast()
            } 

            queue.addLast(i)
        }

        output[0] = nums[queue.first()]

        for(i in k until nums.size){
            if(queue.first() <= i - k){
                queue.removeFirst()
            }

            while(queue.isNotEmpty() && nums[queue.last()] <= nums[i]){
                queue.removeLast()
            } 

            queue.addLast(i)

            output[i - k + 1] = nums[queue.first()]
        }

        return output
    }
}
