class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val anagramGroups = hashMapOf<String, MutableList<String>>()
        val result = mutableListOf<List<String>>()

        for (i in strs) {
            val i_sorted = i.toCharArray().sorted().toString()

            if(!anagramGroups.containsKey(i_sorted)){
                anagramGroups[i_sorted] = mutableListOf<String>()
            }

            anagramGroups[i_sorted]?.add(i)
        }

        for (i in anagramGroups.values) {
            result.add(i)
        }

        return result
    }
}
