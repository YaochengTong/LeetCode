
// @Title: 颜色分类 (Sort Colors)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-09-28 22:06:38
// @Runtime: 0 ms
// @Memory: N/A

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, i = 0;
        int high = nums.length -1;
        
        while (i <= high) {
            if (nums[i] == 0) { swap(low++,i++,nums); }
            else if (nums[i] == 2) { swap(i,high--,nums); }
            else if (nums[i] == 1) { i++; }
            
        }
    }
    
    public void swap(int a,int b,int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
