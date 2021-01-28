
// @Title: 统计「优美子数组」 (Count Number of Nice Subarrays)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-25 22:04:12
// @Runtime: 3 ms
// @Memory: 47 MB

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] map = new int[nums.length + 1];
        map[0] = 1;
        int odds = 0, count = 0;
        for (int n : nums) {
            odds += n & 1;
            if (odds - k >= 0) { count += map[odds - k]; }
            map[odds]++;
        }
        return count;
    }
}
