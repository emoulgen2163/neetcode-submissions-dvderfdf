class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val smallerArray = if(nums1.size <= nums2.size) nums1 else nums2
        val largerArray = if(nums1.size <= nums2.size) nums2 else nums1

        val totalLength = smallerArray.size + largerArray.size

        val mid = (totalLength + 1) / 2

        var left = 0
        var right = smallerArray.size

        while(left <= right){
            val leftPartition = left + (right - left) / 2
            val rightPartition = mid - leftPartition

            val left1 = if(leftPartition == 0) Int.MIN_VALUE else smallerArray[leftPartition - 1]
            val right1 = if(leftPartition == smallerArray.size) Int.MAX_VALUE else smallerArray[leftPartition]

            val left2 = if(rightPartition == 0) Int.MIN_VALUE else largerArray[rightPartition - 1]
            val right2 = if(rightPartition == largerArray.size) Int.MAX_VALUE else largerArray[rightPartition]

            if(left1 <= right2 && left2 <= right1){
                return if(totalLength % 2 == 0){
                    (max(left1, left2) + min(right1, right2)) / 2.0
                } else{
                    max(left1, left2).toDouble()
                }
            } else if(left1 > right2){
                right = leftPartition - 1
            } else{
                left = leftPartition + 1
            }
        }

        return 0.0
    }
}
