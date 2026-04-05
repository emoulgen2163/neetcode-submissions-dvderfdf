class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val frequencyMap = hashMapOf<Char, Int>()
        var left = 0
        var maxLength = 0
        var maxFreq = 0

        for(right in s.indices){
            frequencyMap[s[right]] = 1 + (frequencyMap[s[right]] ?: 0)

            maxFreq = max(maxFreq, frequencyMap[s[right]] ?: 0)
            val replacementsNeeded = (right - left + 1) - maxFreq

            if (replacementsNeeded > k){
                frequencyMap[s[left]] = (frequencyMap[s[left]] ?: 0) - 1
                left++
            }

            maxLength = max(maxLength, right - left + 1)
        }

        return maxLength
    }
}
