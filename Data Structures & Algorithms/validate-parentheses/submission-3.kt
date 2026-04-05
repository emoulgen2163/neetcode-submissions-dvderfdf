class Solution {
    fun isValid(s: String): Boolean {
        val charStack = Stack<Char>()

    if (s.length == 1) return false

    for (i in s.indices){
        when(s[i]){
            '(', '[', '{' -> charStack.push(s[i])
            ')' -> if (charStack.isNotEmpty() && charStack.peek() == '(') charStack.pop() else return false
            ']' -> if (charStack.isNotEmpty() && charStack.peek() == '[') charStack.pop() else return false
            '}' -> if (charStack.isNotEmpty() && charStack.peek() == '{') charStack.pop() else return false
        }
    }

    return charStack.isEmpty()
    }
}
