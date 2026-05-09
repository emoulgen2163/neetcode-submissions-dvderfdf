class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        var left = 1
        var right = piles.max()
        
        var result = right

        while(left <= right){
            val mid = left + (right - left) / 2
            var totalHours = 0
            for(pile in piles){
                val time = Math.ceil(pile.toDouble() / mid).toInt()
                totalHours += time
            }

            if(totalHours <= h){
                result = mid
                right = mid - 1
            } else{
                left = mid + 1
            }

        }

        return result
    }
}
