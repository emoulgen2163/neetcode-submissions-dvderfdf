class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean hasDuplicates = false;

        for (int num = 0; num < nums.length; num++) {
            if (set.contains(nums[num])) {
                hasDuplicates = true;
            }
            set.add(nums[num]);
        }

        return hasDuplicates;
    }
}