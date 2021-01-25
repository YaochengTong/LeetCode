
// @Title: 和为K的子数组 (Subarray Sum Equals K)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-24 19:51:28
// @Runtime: 25 ms
// @Memory: 41.1 MB

class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] map = new int[nums.length + 1];
        map[0] = 1;
        int preSum = 0, count = 0;
        for (int n : nums) {
            preSum += n;
            if (preSum - k >= 0) { count += map[preSum - k]; }
            map[preSum]++;
        }
        return count;
    }
}
