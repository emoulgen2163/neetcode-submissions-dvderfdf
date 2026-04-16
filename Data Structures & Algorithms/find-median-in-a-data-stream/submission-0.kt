class MedianFinder {
    val minHeap = PriorityQueue<Int>()
    val maxHeap = PriorityQueue<Int>(compareByDescending { it })

    fun addNum(num: Int) {
        maxHeap.add(num)
        minHeap.add(maxHeap.poll())

        if(minHeap.size > maxHeap.size){
            maxHeap.add(minHeap.poll())
        }
    }

    fun findMedian(): Double {

        return if(minHeap.size < maxHeap.size){
            (maxHeap.peek()).toDouble()
        } else{
            (maxHeap.peek() + minHeap.peek()) / 2.0
        }
    }
}