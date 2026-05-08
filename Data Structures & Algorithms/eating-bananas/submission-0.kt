class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.max()
        var result = right

        while(left <= right){
                val mid = left + (right - left) / 2
                var sum = 0

                for (pile in piles) {
                    val bananas = Math.ceil((pile.toDouble() / mid)).toInt()
                    sum += bananas
                }

                if(sum <= h){
                    result = mid
                    right = mid - 1
                } else{
                    left = mid + 1
                }
            }

        return result
    }
}
