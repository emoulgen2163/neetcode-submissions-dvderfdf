class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val charCount = hashMapOf<Char, Int>()
        var left = 0
        var maxLength = 0
        var maxFreq = 0

        for (right in s.indices) {
            charCount[s[right]] = 1 + (charCount[s[right]] ?: 0)

            maxFreq = Math.max(charCount[s[right]] ?: 0, maxFreq)
            
            while((right - left + 1) - maxFreq > k){
                charCount[s[left]] = (charCount[s[left]]!!) - 1
                left++
            }

            maxLength = Math.max((right - left + 1), maxLength)
        }

        return maxLength
    }
}
