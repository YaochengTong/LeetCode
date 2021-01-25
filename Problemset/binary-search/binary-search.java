
// @Title: 二分查找 (Binary Search)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-13 05:01:05
// @Runtime: 0 ms
// @Memory: 39.4 MB

class Solution {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else { high = mid - 1; }
        }
        return -1;
    }
    
}
