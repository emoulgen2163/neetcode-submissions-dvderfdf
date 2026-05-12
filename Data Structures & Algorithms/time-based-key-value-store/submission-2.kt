class TimeMap() {
    val keyMap  = hashMapOf<String, ArrayList<Pair<String, Int>>>()

    fun set(key: String, value: String, timestamp: Int) {
        if(!keyMap.containsKey(key)){
            keyMap[key] = arrayListOf()
        }

        val valueMap = Pair(value, timestamp)
        keyMap[key]!!.add(valueMap)
    }

    fun get(key: String, timestamp: Int): String {
        var result = ""

        val current = keyMap[key]

        if(current == null) return result

        var left = 0
        var right = current.size - 1

        while(left <= right){
            val mid = left + (right - left) / 2

            if(current[mid].second <= timestamp){
                result = current[mid].first
                left = mid + 1
            } else{
                right = mid - 1
            }
        }

        return result
    }
}
