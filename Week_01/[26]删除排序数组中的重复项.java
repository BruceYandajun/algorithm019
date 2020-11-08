class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums.length;
        }
        int i , j;
        for (i = 0, j = 1; j < nums.length; j ++) {
            if (nums[i] != nums[j]) {
                if (i + 1 != j) {
                    nums[i + 1] = nums[j];
                }
                i ++;
            }
        }
        return i + 1;
    }
}
