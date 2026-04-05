class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        val currentCandidates = mutableListOf<Int>()

        fun backtrackingCombination(nums: IntArray, target: Int, currentCandidates: MutableList<Int>, sum: Int, index: Int, answer: MutableList<List<Int>>){
            if(sum == target){
                answer.add(currentCandidates.toList())
            } else if(sum < target){
                for (i in index until nums.size) {
                    currentCandidates.add(nums[i])
                    backtrackingCombination(nums, target, currentCandidates, sum + nums[i], i, answer)
                    currentCandidates.removeLast()
                }
            } 
            
        }

        backtrackingCombination(nums, target, currentCandidates, 0, 0, answer)

        return answer
    }
}
