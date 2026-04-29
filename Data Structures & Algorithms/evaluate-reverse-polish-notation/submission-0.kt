class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = ArrayList<Int>()
        var res = 0

        for (i in tokens) {
            val isOperator = (i == "+") || (i == "-") || (i == "*") || (i == "/")
            if(isOperator){
                val b = stack.removeLast()
                val a = stack.removeLast()
                
                when(i){
                    "+" -> res = a + b
                    "-" -> res = a - b
                    "*" -> res = a * b
                    "/" -> res = a / b
                }

                stack.add(res)
            } else{
                stack.add(i.toInt())
            }
        }

        return stack.last()
    }
}
