class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for(i in matrix.indices){
            var left = 0
            var right = matrix[i].size - 1

            while(left <= right){
                val mid = left + (right - left) / 2

                if(matrix[i][mid] == target){
                    return true
                } else if(matrix[i][mid] < target){
                    left = mid + 1
                } else{
                    right = mid - 1
                }
            }
                
        }

        return false
    }
}
