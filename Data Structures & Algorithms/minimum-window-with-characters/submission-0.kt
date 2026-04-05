class Solution {
    fun minWindow(s: String, t: String): String {
        val sMap = hashMapOf<Char, Int>()
        val tMap = hashMapOf<Char, Int>()

        var left = 0
        var count = 0

        var startIndex = -1
        var minLen = Int.MAX_VALUE

        for(i in t){
            tMap[i] = 1 + (tMap[i] ?: 0)
        }

        for(right in s.indices){
            sMap[s[right]] = 1 + (sMap[s[right]] ?: 0)

            if(tMap.containsKey(s[right]) && sMap[s[right]]!! <= tMap[s[right]]!!){
                count++
            }

            while(count == t.length){
                
                if((right - left + 1) < minLen){
                    startIndex = left
                    minLen = right - left + 1
                }

                sMap[s[left]] = sMap[s[left]]!! - 1

                if(tMap.containsKey(s[left]) && sMap[s[left]]!! < tMap[s[left]]!!){
                    count--
                }

                left++
            }
        }

        if(startIndex == -1){
            return ""
        }

        return s.substring(startIndex, startIndex + minLen)
    }
}
