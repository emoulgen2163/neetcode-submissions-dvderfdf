class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for(i in matrix.indices){
            val col = matrix[i]
            var left = 0
            var right = col.size - 1

            while(left <= right){
                val mid = left + (right - left) / 2

                if(col[mid] == target){
                    return true
                } else if(col[mid] < target){
                    left = mid + 1
                } else{
                    right = mid - 1
                }
            }
        }

        return false
    }
}
