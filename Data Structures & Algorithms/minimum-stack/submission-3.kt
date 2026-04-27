class MinStack() {
    val stack = ArrayDeque<Int>()
    val preStack = ArrayDeque<Int>()

    fun push(`val`: Int) {
        stack.add(`val`)
        if(preStack.isEmpty() || `val` <= preStack.last()){
            preStack.add(`val`)
        }
    }

    fun pop() {
        val pop = stack.removeLast()
        if(preStack.last() == pop){
            preStack.removeLast()
        }
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return preStack.last()
    }
}
