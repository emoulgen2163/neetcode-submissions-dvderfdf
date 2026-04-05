class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indexMap = hashMapOf<Int, Int>()

        for(i in nums.indices){
            val difference = target - nums[i]

            if(indexMap.containsKey(difference)){
                return intArrayOf(indexMap[difference]!!, i)
            }

            indexMap[nums[i]] = i
        }

        return intArrayOf()
    }
}
