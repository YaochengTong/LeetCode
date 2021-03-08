
// @Title: 移动零 (Move Zeroes)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-03 14:50:35
// @Runtime: 0 ms
// @Memory: 39 MB

class Solution {

    public void moveZeroes(int[] nums) {
        int i = 0, curr = 0;
        while (curr < nums.length) {
            if (nums[curr] != 0) { swap(nums, i++, curr); }
            curr++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

}
