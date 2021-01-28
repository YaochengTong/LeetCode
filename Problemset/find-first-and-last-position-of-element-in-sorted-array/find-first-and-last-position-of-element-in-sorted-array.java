
// @Title: 在排序数组中查找元素的第一个和最后一个位置 (Find First and Last Position of Element in Sorted Array)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-27 18:40:07
// @Runtime: 0 ms
// @Memory: 41.6 MB

class Solution {

    public int[] searchRange(int[] nums, int target) {
        return new int[] { left_bound(nums, target), right_bound(nums, target) };
    }

    public int left_bound(int[] nums, int key) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < key) { low = mid + 1; } else { high = mid - 1; }
        }
        if (low >= nums.length || nums[low] != key) { return -1; }
        return low;
    }

    public int right_bound(int[] nums, int key) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > key) { high = mid - 1; } else { low = mid + 1; }
        }
        if (high < 0 || nums[high] != key) { return -1; }
        return high;
    }

}
