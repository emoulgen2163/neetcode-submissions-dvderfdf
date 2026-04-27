class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val result = ArrayList<List<Int>>()

        for(i in nums.indices){
            if(i > 0 && nums[i] == nums[i - 1]) continue

            var left = i + 1
            var right = nums.size - 1
            val target = -nums[i]

            while(left < right){
                if(nums[left] + nums[right] == target){
                    result.add(listOf(nums[i], nums[left], nums[right]))
                    left++
                    right--

                    while(left < right && nums[left] == nums[left - 1]) left++

                } else if(nums[left] + nums[right] < target) {
                    left++
                } else{
                    right--
                }
            }
        }

        return result
    }
}
