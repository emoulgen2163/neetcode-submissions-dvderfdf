class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy{ it[0] }
        val output = ArrayList<IntArray>()

        output.add(intervals[0])

        for (i in 1 until intervals.size) {

            if(output.last()[1] >= intervals[i][0]){
                output.last()[1] = Math.max(output.last()[1], intervals[i][1])
            } else{
                output.add(intervals[i])
            }
        }

        return output.toTypedArray()
    }
}
