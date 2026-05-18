class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buy = 0
        var maxProfit = 0

        for(sell in 1 until prices.size){
            if(prices[buy] > prices[sell]){
                buy = sell
            }

            val profit = prices[sell] - prices[buy]
            maxProfit = max(profit, maxProfit)
        }

        return maxProfit
    }
}
