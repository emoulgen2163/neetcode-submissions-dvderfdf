class Solution {
    fun trap(height: IntArray): Int {
        var left = 0
        var right = height.size - 1

        var leftMax = height[left]
        var rightMax = height[right]

        var total = 0
        while(left < right){
            if(height[left] < height[right]){
                left++
                leftMax = max(leftMax, height[left])
                total += leftMax - height[left]
            } else{
                right--
                rightMax = max(rightMax, height[right])
                total += rightMax - height[right]
            }
        }

        return total
    }
}
