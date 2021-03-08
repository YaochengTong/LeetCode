
// @Title: 分割数组 (Partition Array into Disjoint Intervals)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-05 19:06:04
// @Runtime: 2 ms
// @Memory: 38.7 MB

class Solution {

    public int partitionDisjoint(int[] A) {
        int leftMax = A[0], max = A[0], index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < leftMax) {
                leftMax = max;
                index = i;
            } else {
                max = Math.max(max,A[i]);
            }
        }
        return index + 1;
    }
}
