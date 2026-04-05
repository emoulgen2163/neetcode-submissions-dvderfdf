class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sMap = hashMapOf<Char, Int>()
        val tMap = hashMapOf<Char, Int>()

        if(s.length != t.length){
            return false
        }

        for(i in s){
            sMap[i] = 1 + (sMap[i] ?: 0)
        }

        for(i in t){
            tMap[i] = 1 + (tMap[i] ?: 0)
        }

        for(i in sMap.keys){
            if(sMap[i] != tMap[i]){
                return false
            }
        }

        return true
    }
}
