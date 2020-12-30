
// @Title: 对角线遍历 (Diagonal Traverse)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-29 00:23:36
// @Runtime: 8 ms
// @Memory: 40.2 MB

class Solution {

    public int[] findDiagonalOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0) { return new int[0]; }
        int M = matrix.length; // row length
        int N = matrix[0].length; // column length
        int[] result = new int[M * N];
        int k = 0;

        for (int i = 0; i < M + N - 1; i++) {
            List<Integer> list = new ArrayList<Integer>();
            int row = i < N ? 0 : i - N + 1;
            int col = i < N ? i : N - 1;
            while (row < M && col > -1) {
                list.add(matrix[row][col]);
                ++row;
                --col;
            }
            if (i % 2 == 0) { Collections.reverse(list); }
            for (int item : list) { result[k++] = item; }
        }
        return result;
    }

}
