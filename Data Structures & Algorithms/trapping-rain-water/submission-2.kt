class Solution {
    fun trap(height: IntArray): Int {
        val leftMax = IntArray(height.size)
        val rightMax = IntArray(height.size)

        leftMax[0] = height[0]
        rightMax[rightMax.size - 1] = height[height.size - 1]

        var totalSum = 0

        for(i in 1 until leftMax.size){
            leftMax[i] = max(leftMax[i - 1], height[i])
        }

        for(i in rightMax.size - 2 downTo 0){
            rightMax[i] = max(rightMax[i + 1], height[i])
        }

        for(i in height.indices){
            totalSum += min(leftMax[i], rightMax[i]) - height[i]
        }

        return totalSum
    }
}
