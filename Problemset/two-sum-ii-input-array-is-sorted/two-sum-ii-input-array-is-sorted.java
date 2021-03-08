
// @Title: 两数之和 II - 输入有序数组 (Two Sum II - Input array is sorted)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-03 15:57:48
// @Runtime: 1 ms
// @Memory: 39 MB

class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0, p2 = numbers.length - 1;
        while (p1 < p2) {
            int sum = numbers[p1] + numbers[p2];
            if (sum == target) { return new int[] { p1 + 1, p2 + 1 }; }
            if (sum < target) { p1++; } else { p2--; }
        }
        return new int[0];
    }

}
