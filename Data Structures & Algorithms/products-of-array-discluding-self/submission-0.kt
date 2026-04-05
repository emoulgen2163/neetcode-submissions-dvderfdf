class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size){ 1 }

        val left = IntArray(nums.size){ 1 }
        val right = IntArray(nums.size){ 1 }

        for (i in 1..<nums.size){
            left[i] = left[i - 1] * nums[i - 1]
        }

        for (i in right.size - 2 downTo 0){
            right[i] = right[i + 1] * nums[i + 1]
        }

        for (i in nums.indices){
            result[i] = left[i] * right[i]
        }

        return result
    }
}
