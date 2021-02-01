
// @Title: 搜索旋转排序数组 (Search in Rotated Sorted Array)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-31 20:26:18
// @Runtime: 0 ms
// @Memory: 37.9 MB

class Solution {

    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) { return mid; }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

}
