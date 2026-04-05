class Solution {

    fun encode(strs: List<String>): String {
        var result = ""

        for (i in strs){
            result += "${i.length}-$i"
        }

        return result
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0

        while (i < str.length){
            var j = i
            while (str[j].isLetterOrDigit()){
                j++
            }
            val length = str.substring(i, j).toInt()
            result.add(str.substring(j + 1, j + 1 + length))
            i = j + 1 + length
        }
        return result
    }
}
