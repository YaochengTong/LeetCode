
// @Title: 和可被 K 整除的子数组 (Subarray Sums Divisible by K)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-25 22:21:35
// @Runtime: 30 ms
// @Memory: 42.1 MB

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int preSum = 0, count = 0;

        for (int n : nums) {
            preSum += n;
            int key = (preSum % k + k) % k;
            if (map.containsKey(key)) { count += map.get(key); }
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return count;
    }
}
