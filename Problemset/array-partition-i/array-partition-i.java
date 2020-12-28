
// @Title: 数组拆分 I (Array Partition I)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-27 16:23:44
// @Runtime: 13 ms
// @Memory: 40.4 MB

class Solution {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) { sum += nums[i]; }
        return sum;
    }
    
}
