class Solution {
    // 暴力版本
    public int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1;i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[i] == target - nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    // Hash版本
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            } 
            map.put(nums[i], i);
            
        }
        return new int[] {-1, -1};
    }
}
