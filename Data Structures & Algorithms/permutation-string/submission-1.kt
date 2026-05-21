class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {

        if(s1.length > s2.length) return false

        val freqMap = hashMapOf<Char, Int>()

        for(i in s1){
            freqMap[i] = 1 + (freqMap[i] ?: 0)
        }

        var left = 0
        var count = 0

        for(right in s2.indices){
            if(freqMap.containsKey(s2[right])){
                freqMap[s2[right]] = (freqMap[s2[right]]!!) - 1

                if(freqMap[s2[right]] == 0) count++
            }

            if((right - left + 1) > s1.length){
            
                if(freqMap.containsKey(s2[left])){

                    if(freqMap[s2[left]] == 0) count --

                    freqMap[s2[left]] = (freqMap[s2[left]]!!) + 1
                }

                left++
            }

            if(count == freqMap.size) return true
        }

        

        return false
    }
}
