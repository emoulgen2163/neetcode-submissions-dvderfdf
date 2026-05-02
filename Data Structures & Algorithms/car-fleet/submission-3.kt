class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val cars = hashMapOf<Int, Int>()

        for(i in position.indices){
            cars[position[i]] = speed[i]
        }

        val carsPosSorted = cars.toSortedMap( compareByDescending { it } )
        val fleet = Stack<Double>()
        
        for(i in carsPosSorted.keys){
            val time = (target - i).toDouble() / carsPosSorted[i]!!
            if(fleet.isEmpty() || time > fleet.peek()){
                fleet.push(time)
            }
        }

        return fleet.size
    }
}
