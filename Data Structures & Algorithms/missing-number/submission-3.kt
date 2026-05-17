class Solution {
    fun missingNumber(nums: IntArray): Int {
        var actualSum = 0
        var arraySum = 0
        
        for(i in nums){
            arraySum += i
        }

        for(i in 0 .. nums.size){
            actualSum += i
        }

        return actualSum - arraySum
    }
}
