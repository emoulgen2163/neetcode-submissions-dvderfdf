class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val final = hashSetOf<List<Int>>()

        for (i in nums.indices){
            var left = i + 1
            var right = nums.size - 1

            while (left < right){
                val sum = nums[left] + nums[right] + nums[i]
                if(sum == 0){
                    final.add(listOf(nums[i], nums[left], nums[right]))
                    left++
                    right--
                } else if(sum > 0){
                    right--
                } else{
                    left++
                }
            }
        }

        return final.toList()
    }
}
