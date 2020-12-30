
// @Title: 对角线遍历 (Diagonal Traverse)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-30 01:32:04
// @Runtime: 6 ms
// @Memory: 40.1 MB

class Solution {

    public int[] findDiagonalOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0) { return new int[0]; }

        int M = matrix.length;
        int N = matrix[0].length;
        List<Integer> list = new ArrayList<Integer>();

        for (int sum = 0; sum < M + N - 1; sum++) {
            if (sum % 2 == 1) {
                // 向下
                for (int i = sum < N ? 0 : sum - N + 1; i <= Math.min(sum, M - 1); i++) {
                    list.add(matrix[i][sum - i]);
                }
            } else {
                // 向上
                for (int i = sum < M ? 0 : sum - M + 1; i <= Math.min(sum, N - 1); i++) {
                    list.add(matrix[sum - i][i]);
                }
            }
        }
        
        int[] result = new int[M * N];
        for (int i = 0; i < list.size(); i++) { result[i] = list.get(i); }
        return result;
    }

}

