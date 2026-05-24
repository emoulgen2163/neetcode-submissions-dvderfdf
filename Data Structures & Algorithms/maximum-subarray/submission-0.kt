class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = nums[0]
        var curSum = nums[0]
        for(i in 1 until nums.size){
            curSum = max(nums[i], curSum + nums[i])
            sum = max(sum, curSum)
        }

        return sum
    }
}
