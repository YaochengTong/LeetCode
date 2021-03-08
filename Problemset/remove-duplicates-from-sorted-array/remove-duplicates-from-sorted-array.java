
// @Title: 删除排序数组中的重复项 (Remove Duplicates from Sorted Array)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-03 15:21:51
// @Runtime: 0 ms
// @Memory: 40.5 MB

class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 0, curr = 1;
        while (curr < nums.length) {
            if (nums[i] != nums[curr]) {
                i++;
                nums[i] = nums[curr];
            }
            curr++;
        }
        return i + 1;
    }

}
