class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        val combination = mutableListOf<Int>()

        fun backTrack(answer: MutableList<List<Int>>, nums: IntArray, target: Int, combination: MutableList<Int>, index: Int, sum: Int){
            if(sum == target){
                answer.add(combination.toList())
            } else if(sum < target){
                for(i in index until nums.size){
                    combination.add(nums[i])
                    backTrack(answer, nums, target, combination, i, sum + nums[i])
                    combination.removeLast()
                }
            }
        }

        backTrack(answer, nums, target, combination, 0, 0)
        return answer
    }
}
