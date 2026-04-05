class Solution {
    fun maxProfit(prices: IntArray): Int {
        var left = 0
        var maxProfit = 0

        for(right in 1 until prices.size){
            if(prices[left] > prices[right]){
                left = right
            }

            val profit = prices[right] - prices[left]
            maxProfit = max(profit, maxProfit)

        }

        return maxProfit
    }
}
