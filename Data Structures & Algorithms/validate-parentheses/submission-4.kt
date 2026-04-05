class Solution {
    fun isValid(s: String): Boolean {

    val charStack = Stack<Char>()

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
