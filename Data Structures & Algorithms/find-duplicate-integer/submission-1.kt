class Solution {
    fun findDuplicate(nums: IntArray): Int {
        for(i in nums.indices){
            if(nums[abs(nums[i]) - 1] < 0){
                return abs(nums[i])
            }

            nums[abs(nums[i]) - 1] *= -1
        }

        return nums.size + 1
    }
}
