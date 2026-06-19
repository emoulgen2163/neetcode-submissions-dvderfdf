class LRUCache(private val capacity: Int) {
    val pair = hashMapOf<Int, Int>()
    val cache = ArrayDeque<Int>()

    fun get(key: Int): Int {
        
        if(cache.contains(key)){
            cache.remove(key)
            cache.addFirst(key)
        }

        return pair[key] ?: -1
    }

    fun put(key: Int, value: Int) {
        if(!pair.containsKey(key)){
            if(cache.size == capacity){
                val last = cache.removeLast()
                pair.remove(last)
            }            
        } else{
            cache.remove(key)
        }

        pair[key] = value
        cache.addFirst(key)

    }
}
