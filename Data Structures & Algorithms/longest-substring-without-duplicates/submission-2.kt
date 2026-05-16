class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val charSet = hashSetOf<Char>()
        
        var left = 0
        var maxLength = 0

        for(right in s.indices){

            while(charSet.contains(s[right])){
                charSet.remove(s[left])
                left++
            }

            charSet.add(s[right])
            val length = right - left + 1
            maxLength = max(length, maxLength)
        }

        return maxLength
    }
}
