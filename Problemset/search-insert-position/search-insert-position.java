
// @Title: 搜索插入位置 (Search Insert Position)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-22 16:42:26
// @Runtime: 0 ms
// @Memory: 38.2 MB

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if ( target < nums[mid]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}
