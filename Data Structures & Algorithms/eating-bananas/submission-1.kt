class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.max()
        var result = right

        while(left <= right){
                val mid = left + (right - left) / 2
                var hours = 0

                for (pile in piles) {
                    val time = Math.ceil((pile.toDouble() / mid)).toInt()
                    hours += time
                }

                if(hours <= h){
                    result = mid
                    right = mid - 1
                } else{
                    left = mid + 1
                }
            }

        return result
    }
}
