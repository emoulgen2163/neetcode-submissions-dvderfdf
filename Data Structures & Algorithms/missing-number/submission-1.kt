class Solution {
    fun missingNumber(nums: IntArray): Int {
        val numsSet = hashSetOf<Int>()

        for(i in nums){
            numsSet.add(i)
        }

        for(i in 0 .. nums.size){
            if(!numsSet.contains(i)){
                return i
            }
        }

        return nums.size + 1
    }
}
