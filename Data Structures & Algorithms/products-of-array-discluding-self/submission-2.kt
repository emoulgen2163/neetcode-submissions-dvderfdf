class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size){ 1 }
        var prefix = 1
        var postfix = 1

        for(i in nums.indices){
            result[i] *= prefix
            prefix *= nums[i]
        }

        for(i in nums.size - 1 downTo 0){
            result[i] *= postfix
            postfix *= nums[i]
        }

        return result
    }
}
