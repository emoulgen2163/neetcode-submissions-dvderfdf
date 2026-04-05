class Solution {

    fun encode(strs: List<String>): String {
        var result = ""

        for(i in strs){
            result += "${i.length}-$i"
        }

        return result
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()

        var left = 0
        while(left < str.length){
            var right = left

            while(str[right] != '-'){
                right++
            }

            val length = str.substring(left, right).toInt()

            result.add(str.substring(right + 1, right + length + 1))

            left = right + length + 1
        }

        return result
    }
}
