class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val occurances = hashMapOf<Int, Int>()

        for(i in nums){
            if(occurances.containsKey(i)){
                return true
            }

            occurances[i] = i
        }

        return false
    }
}
