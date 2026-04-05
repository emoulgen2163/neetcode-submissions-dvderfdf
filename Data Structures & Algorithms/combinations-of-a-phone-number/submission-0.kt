class Solution {
    fun letterCombinations(digits: String): List<String> {
        val answer = mutableListOf<String>()
        if (digits.isEmpty()) return emptyList()
        val digitMap = hashMapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
        )

        backtrack(answer, digitMap, 0, "", digits)

        return answer
    }

    fun backtrack(ans: MutableList<String>, digitMap: HashMap<Char, String>, index: Int, permutation: String, digits: String){
        if (permutation.length == digits.length){
            ans.add(permutation)
            return
        }
        val currentDigit = digits[index]
        val currentString = digitMap[currentDigit] ?: ""
        for (char in currentString){
            backtrack(ans, digitMap, index + 1, permutation + char, digits)
        }
    }
}
