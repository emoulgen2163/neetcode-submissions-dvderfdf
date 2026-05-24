class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val output = IntArray(nums.size){ 1 }

        var prefix = 1
        for(i in nums.indices){
            output[i] *= prefix
            prefix *= nums[i]
        }

        var postfix = 1
        for(i in nums.size - 1 downTo 0){
            output[i] *= postfix
            postfix *= nums[i]
        }

        return output
    }
}
