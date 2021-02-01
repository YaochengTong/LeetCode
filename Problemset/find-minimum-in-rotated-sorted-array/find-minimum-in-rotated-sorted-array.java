
// @Title: 寻找旋转排序数组中的最小值 (Find Minimum in Rotated Sorted Array)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-02-01 00:48:40
// @Runtime: 0 ms
// @Memory: 38 MB

class Solution {

    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[high];
    }

}

