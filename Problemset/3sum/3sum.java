
// @Title: 三数之和 (3Sum)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-24 23:17:52
// @Runtime: 22 ms
// @Memory: 42.2 MB

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) { break; }
            if (i > 0 && nums[i] == nums[i - 1]) { continue; }
            int p1 = i + 1, p2 = nums.length - 1;

            while (p1 < p2) {
                int sum = nums[i] + nums[p1] + nums[p2];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    while (p1 < p2 && nums[p1] == nums[p1 + 1]) { p1++; }
                    while (p1 < p2 && nums[p2] == nums[p2 - 1]) { p2--; }
                    p1++;
                    p2--;
                } else if (sum < 0) {
                    p1++;
                } else {
                    p2--;
                }
            }
        }

        return result;
    }
    
}
