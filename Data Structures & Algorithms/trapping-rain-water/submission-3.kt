class Solution {
    fun trap(height: IntArray): Int {
        var left = 0
        var right = height.size - 1

        var leftMax = height[left]
        var rightMax = height[right]

        var totalSum = 0

        while(left < right){
            if(leftMax < rightMax){
                left++
                leftMax = max(leftMax, height[left])
                totalSum += leftMax - height[left]
            } else{
                right--
                rightMax = max(rightMax, height[right])
                totalSum += rightMax - height[right]
            }
        }

        return totalSum
    }
}
