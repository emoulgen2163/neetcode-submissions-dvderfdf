class MedianFinder {
    val leftHeap = PriorityQueue<Int>()
    val rightHeap = PriorityQueue<Int>(compareByDescending{ it })

    fun addNum(num: Int) {
        rightHeap.add(num)
        leftHeap.add(rightHeap.poll())

        if(rightHeap.size < leftHeap.size){
            rightHeap.add(leftHeap.poll())
        }
    }

    fun findMedian(): Double {
        return if(rightHeap.size > leftHeap.size){
            rightHeap.first().toDouble()
        } else{
            (rightHeap.first() + leftHeap.first()) / 2.0
        }
    }
}
