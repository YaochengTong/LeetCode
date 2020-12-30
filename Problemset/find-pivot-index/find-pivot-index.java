
// @Title: 寻找数组的中心索引 (Find Pivot Index)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-10-22 15:50:42
// @Runtime: 480 ms
// @Memory: 39.1 MB

class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0 ) { return -1;}
        for(int i = 0;i<nums.length; i++) {
            if (checkLeftRight(i, nums)) {
                return i;
            }
        }
        return -1;
        
    }

    public boolean checkLeftRight(int index,int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i<index;i++) {
            sum1 = sum1+nums[i];
        }
        for (int j = nums.length -1; j> index;j--) {
            sum2 = sum2+nums[j];
        }
        if(sum1 == sum2) { return true;}
        return false;
    }

}
