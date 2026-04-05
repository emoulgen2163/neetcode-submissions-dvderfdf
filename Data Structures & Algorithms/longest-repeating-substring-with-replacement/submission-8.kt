class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val frequencyMap = hashMapOf<Char, Int>()
        var left = 0
        var maxFreq = 0
        var maxLength = 0

        for(right in s.indices){
            frequencyMap[s[right]] = 1 + (frequencyMap[s[right]] ?: 0)
            maxFreq = max(maxFreq, frequencyMap[s[right]]!!)
            val repmacementsNeeded = (right - left + 1) - maxFreq

            if(repmacementsNeeded > k){
                frequencyMap[s[left]] = frequencyMap[s[left]]!! - 1
                left++
            }

            maxLength = max(maxLength, (right - left + 1))
            
        }

        return maxLength
    }
}
