class Solution {
    fun trap(height: IntArray): Int {
        var leftArray = IntArray(height.size)
        var rightArray = IntArray(height.size)
        var maxArea = 0

        leftArray[0] = height[0]
        rightArray[rightArray.size - 1] = height[height.size - 1]

        for(i in 1 until leftArray.size){
            leftArray[i] = max(leftArray[i - 1], height[i])
        }

        for(i in rightArray.size - 2 downTo 0){
            rightArray[i] = max(rightArray[i + 1], height[i])
        }

        for(i in height.indices){
            val area = min(rightArray[i], leftArray[i]) - height[i]

            maxArea += area
        }

        return maxArea
    }
}
