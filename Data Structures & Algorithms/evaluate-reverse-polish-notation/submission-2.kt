class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val cache = Stack<Int>()
        var result = 0

        for(i in tokens){
            val isOperator = (i == "+") || (i == "-") || (i == "*") || (i == "/")

            if(isOperator){
                val b = cache.pop()
                val a = cache.pop()

                when(i){
                    "+" -> result = a + b
                    "-" -> result = a - b
                    "*" -> result = a * b
                    "/" -> result = a / b
                }
                cache.push(result)
            } else{
                cache.push(i.toInt())
            }
        }

        return cache.pop()

    }
}
