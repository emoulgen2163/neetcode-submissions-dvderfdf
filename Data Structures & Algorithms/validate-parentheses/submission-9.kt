class Solution {
    fun isValid(s: String): Boolean {
        val valid = ArrayList<Char>()

        for(i in s){
            
            when(i){
                '(', '[', '{' -> valid.add(i)

                ')' -> {
                    if(valid.isNotEmpty() && valid.last() == '('){ 
                        valid.removeLast()
                    } else{
                        return false
                    }
                }
                ']' ->{
                    if(valid.isNotEmpty() && valid.last() == '['){
                        valid.removeLast()
                    } else{
                        return false
                    }
                } 
                '}' -> {
                    if(valid.isNotEmpty() && valid.last() == '{') {
                        valid.removeLast()
                    } else{
                        return false
                    }
                }
            }
        }

        return valid.isEmpty()
    }
}
