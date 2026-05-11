class TimeMap() {
    
    val keyMap = hashMapOf<String, ArrayList<Pair<Int, String>>>()

    fun set(key: String, value: String, timestamp: Int) {
        if(!keyMap.containsKey(key)){
            keyMap[key] = arrayListOf()
        }

        val timeValues = keyMap[key]

        timeValues!!.add(Pair(timestamp, value))

    }

    fun get(key: String, timestamp: Int): String {
        var result = ""
        val values = keyMap[key] ?: return result
        
        var left = 0
        var right = values.size - 1

        while(left <= right){
            val mid = left + (right - left) / 2
            val current = values[mid]
        
            if(current.first <= timestamp){
                result = current.second
                left = mid + 1
            } else{
                right = mid - 1
            }
        }

        return result
    }
}
