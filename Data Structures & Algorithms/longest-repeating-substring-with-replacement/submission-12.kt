class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val freqMap = hashMapOf<Char, Int>()
        var maxFreq = 0
        var maxLength = 0
        var left = 0

        for(right in s.indices){
            freqMap[s[right]] = 1 + (freqMap[s[right]] ?: 0)

            maxFreq = max(maxFreq, freqMap[s[right]] ?: 0)

            while(((right - left) + 1) - maxFreq > k){
                freqMap[s[left]] = (freqMap[s[left]]!!) - 1
                left++
            }

            maxLength = max(((right - left) + 1), maxLength)
        }

        return maxLength

    }
}
