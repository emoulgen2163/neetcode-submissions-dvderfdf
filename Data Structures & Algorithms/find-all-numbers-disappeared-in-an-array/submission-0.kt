class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        for(i in nums.indices){
            val actualIndex = abs(nums[i]) - 1
            if(nums[actualIndex] > 0){
                nums[actualIndex] *= -1
            }
        }

        val disappearedNumbers = mutableListOf<Int>()

        for(index in nums.indices){
            if(nums[index] > 0){
                disappearedNumbers.add(index + 1)
            }
        }

        return disappearedNumbers

    }
}
