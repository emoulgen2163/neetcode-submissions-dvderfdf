class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toSet()
        var maxLength = 0

        for (num in nums) {
            if((num - 1) !in numSet){
                var length = 0
                while((num + length) in numSet){
                    length++
                }

                maxLength = max(maxLength, length)
            }
        }

        return maxLength
    }
}
