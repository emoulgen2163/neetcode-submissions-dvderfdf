class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if(nums.size < 3){
            return emptyList()
        }

        nums.sort()

        val result = hashSetOf<List<Int>>()

        for (i in nums.indices) {
            var left = i + 1
            var right = nums.size - 1

            while(left < right){
                val sum = nums[i] + nums[left] + nums[right]

                if(sum == 0){
                    result.add(listOf(nums[i], nums[left], nums[right]))
                    left++
                    right--
                } else if(sum > 0){
                    right--
                } else{
                    left++
                }
            }
        }

        return result.toList()
    }
}
