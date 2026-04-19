class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        val combinations = ArrayList<Int>()
        backtrack(nums, target, result, combinations, 0, 0)
        return result
    }

    fun backtrack(nums: IntArray, target: Int, result: ArrayList<List<Int>>, combinations: ArrayList<Int>, index: Int, sum: Int){
        if(sum == target){
            result.add(combinations.toList())
        } else if(sum < target){
            for(i in index until nums.size){
                combinations.add(nums[i])
                backtrack(nums, target, result, combinations, i, sum + nums[i])
                combinations.removeLast()
            }
        }
    }
}
