class Solution {
    fun combinationSum(nums: IntArray, target: Int): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        val currentCandidate = mutableListOf<Int>()

        solution(answer, currentCandidate, target, nums, 0, 0)

        return answer
    }

    fun solution(answer: MutableList<List<Int>>, currentCandidate: MutableList<Int>, target: Int, nums: IntArray, index: Int, sum: Int) {
        if(sum == target){
            answer.add(currentCandidate.toList())
        } else if(sum < target){
            for(candidate in index..< nums.size){
                currentCandidate.add(nums[candidate])
                solution(answer, currentCandidate, target, nums, candidate, sum + nums[candidate])
                currentCandidate.removeAt(currentCandidate.size - 1)
            }
        }
    }
}
