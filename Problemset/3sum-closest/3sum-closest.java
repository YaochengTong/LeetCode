
// @Title: 最接近的三数之和 (3Sum Closest)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-07 23:19:44
// @Runtime: 6 ms
// @Memory: 37.9 MB

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) { return sum; }
                if (sum < target) { left++; } else { right--; }
                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
