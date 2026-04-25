class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = ArrayList<List<Int>>()

        for(i in 0 until nums.size - 2){
            if (i > 0 && nums[i] == nums[i - 1]) continue
            
            var left = i + 1
            var right = nums.size - 1
            val target = -1 * nums[i]

            while(left < right){
                if(nums[left] + nums[right] == target){

                    val sum = listOf(nums[left], nums[right], nums[i])
                    result.add(sum)
                    left++
                    right--
                    
                    while(left < right && nums[left] == nums[left - 1]) left++
                    while(left < right && nums[right] == nums[right + 1]) right--

                } else if(nums[left] + nums[right] < target){
                    left++
                } else{
                    right--
                }
            }
        }

        return result
    }
}
