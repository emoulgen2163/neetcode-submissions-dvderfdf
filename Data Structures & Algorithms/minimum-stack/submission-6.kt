class MinStack() {

    val stack = ArrayList<Int>()
    val minStack = ArrayList<Int>()

    fun push(`val`: Int) {
        stack.add(`val`)

        if(minStack.isEmpty || `val` <= minStack[minStack.size - 1]){
            minStack.add(`val`)
        }
    }

    fun pop() {
        val pop = stack.removeAt(stack.size - 1)

        if(pop == minStack[minStack.size - 1]){
            minStack.removeAt(minStack.size - 1)
        }
    }

    fun top(): Int {
        return stack[stack.size - 1]
    }

    fun getMin(): Int {
        return minStack[minStack.size - 1]
    }
}
