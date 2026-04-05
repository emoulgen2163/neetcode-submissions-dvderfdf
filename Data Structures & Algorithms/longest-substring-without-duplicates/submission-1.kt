class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val unique = hashSetOf<Char>()
        var left = 0
        var maxLength = 0

        for(right in s.indices){
            while(unique.contains(s[right])){
                unique.remove(s[left])
                left++
            }

            unique.add(s[right])
            val length = right - left + 1
            maxLength = max(length, maxLength)
        }

        return maxLength
    }
}
