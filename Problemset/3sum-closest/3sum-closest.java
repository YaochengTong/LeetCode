
// @Title: 最接近的三数之和 (3Sum Closest)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-24 23:28:13
// @Runtime: 6 ms
// @Memory: 37.9 MB

class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int p1 = i + 1, p2 = nums.length - 1;
            while (p1 < p2) {
                int sum = nums[i] + nums[p1] + nums[p2];
                if (sum == target) { return sum; }
                if (sum < target) { p1++; } else { p2--; }
                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }
            }
        }
        return result;
    }


}
