class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val sequenceMap = hashMapOf<Int, Boolean>()
        var maxLength = 0
        
        for (num in nums) {
            sequenceMap[num] = false
        }

        for (num in nums.indices) {
            var currentLength = 1

            var nextNum = nums[num] + 1
            while(sequenceMap.containsKey(nextNum) && sequenceMap[nextNum] == false){
                currentLength++
                sequenceMap[nextNum] = true
                nextNum++
            }

            var prevNum = nums[num] - 1

            while(sequenceMap.containsKey(prevNum) && sequenceMap[prevNum] == false){
                currentLength++
                sequenceMap[prevNum] = true
                prevNum--
            }

            maxLength = max(maxLength, currentLength)
        }

        return maxLength
    }
}
