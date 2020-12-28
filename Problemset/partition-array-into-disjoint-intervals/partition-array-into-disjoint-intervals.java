
// @Title: 分割数组 (Partition Array into Disjoint Intervals)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-27 22:09:18
// @Runtime: 2 ms
// @Memory: 38.9 MB

class Solution {

    public int partitionDisjoint(int[] A) {
        int leftMax = A[0], max = A[0], index = 0;
        for (int i = 0; i < A.length; i++) {
            if (leftMax <= A[i]) {
                max = Math.max(max, A[i]);
            } else {
                leftMax = max;
                index = i;
            }
        }
        return index + 1;
    }
    
}
