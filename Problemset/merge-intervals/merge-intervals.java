
// @Title: 合并区间 (Merge Intervals)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-28 01:31:14
// @Runtime: 6 ms
// @Memory: 41.1 MB

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; ++i) {
            int L = intervals[i][0], R = intervals[i][1];
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
