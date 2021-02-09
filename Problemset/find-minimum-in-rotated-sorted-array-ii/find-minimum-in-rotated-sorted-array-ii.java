
// @Title: 寻找旋转排序数组中的最小值 II (Find Minimum in Rotated Sorted Array II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-02-01 14:57:41
// @Runtime: 0 ms
// @Memory: 38.3 MB

class Solution {

    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high--;
            }
        }
        return nums[low];
    }


}

