class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while(left < right){
            val mid = left + (right - left) / 2

            if(nums[mid] > nums[right]){
                left = mid + 1
            } else{
                right = mid
            }
        }

        val pivot = left

        val leftTarget = binarySearch(0, pivot - 1, nums, target)
        val rightTarget = binarySearch(pivot, nums.size - 1, nums, target)

        return if(leftTarget != -1){
            leftTarget
        } else{
            rightTarget
        }
    }

    fun binarySearch(left: Int, right: Int, nums: IntArray, target: Int): Int{
        var l = left
        var r = right
        while(l <= r){
            val mid = l + (r - l) / 2

            if(nums[mid] == target){
                return mid
            } else if(nums[mid] < target){
                l = mid + 1
            } else{
                r = mid - 1
            }
        }

        return - 1
    }
}
