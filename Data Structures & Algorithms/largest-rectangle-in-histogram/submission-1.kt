class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val stack = Stack<Int>()
        var maxArea = 0

        for(i in 0 .. heights.size){
            

            while(stack.isNotEmpty() && (i == heights.size || heights[i] < heights[stack.peek()])){

                val height = heights[stack.pop()]
                val width = if (stack.isEmpty()) i else i - stack.peek() - 1
                val area = height * width
                maxArea = max(area, maxArea)

            }

            stack.push(i)
        }

        return maxArea
    }
}
