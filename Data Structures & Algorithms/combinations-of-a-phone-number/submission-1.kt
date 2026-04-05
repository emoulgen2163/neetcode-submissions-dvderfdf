class Solution {
    fun letterCombinations(digits: String): List<String> {
        val answer = mutableListOf<String>()        

        if(digits.isEmpty()){
            return answer
        }

        val digitMap = hashMapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz",
        )

        backTrack(answer, digitMap, 0, "", digits)

        return answer
    }

    fun backTrack(answer: MutableList<String>, digitMap: HashMap<Char, String>, index: Int, currentChar: String, digits: String){

        if(currentChar.length == digits.length){
            answer.add(currentChar)
            return
        }

        val currentDigit = digits[index]
        val currentString = digitMap[currentDigit] ?: ""

        for (char in currentString) {
            backTrack(answer, digitMap, index + 1, currentChar + char, digits)
        }
    } 
}
