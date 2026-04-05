class Solution {

    fun encode(strs: List<String>): String {
        var result = ""

        for (i in strs) {
            result += "${i.length}-$i"
        }

        return result
    }

    fun decode(str: String): List<String> {

        val list = mutableListOf<String>()

        var left = 0

        while(left < str.length){
            var right = left

            while(str[right] != '-'){
                right++
            }

            val length = str.substring(left, right).toInt()

            list.add(str.substring(1 + right, 1 + right + length))

            left = 1 + right + length
        }

        return list
    }
}
