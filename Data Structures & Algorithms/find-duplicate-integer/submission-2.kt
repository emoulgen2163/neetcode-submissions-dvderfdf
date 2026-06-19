class Solution {
    fun findDuplicate(nums: IntArray): Int {
        for(i in nums.indices){
            
            val absIndex = abs(nums[i])
            if(nums[absIndex - 1] < 0){
                return absIndex
            }

            nums[absIndex - 1] *= -1 
        }

        return -1
    }
}
