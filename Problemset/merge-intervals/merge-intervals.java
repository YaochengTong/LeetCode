
// @Title: 合并区间 (Merge Intervals)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-18 22:30:47
// @Runtime: 6 ms
// @Memory: 41.2 MB

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<int[]>();
        for (int[] pair : intervals) {
            int L = pair[0], R = pair[1];
            int topIndex = merged.size() - 1;
            if (merged.isEmpty() || merged.get(topIndex)[1] < L) {
                merged.add(new int[] { L, R });
            } else {
                merged.get(topIndex)[1] = Math.max(merged.get(topIndex)[1], R);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
