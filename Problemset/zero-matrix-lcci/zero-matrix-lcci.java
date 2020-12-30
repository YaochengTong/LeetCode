
// @Title: 零矩阵 (Zero Matrix LCCI)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-28 17:30:05
// @Runtime: 1 ms
// @Memory: 40.1 MB

class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) { list.add(new int[] { i, j }); }
            }
        }
        for (int[] pairs : list) { changeToZero(matrix, pairs[0], pairs[1]); }
    }

    private void changeToZero(int[][] matrix, int row, int col) {
        for (int i = 0; i < matrix[row].length; i++) { matrix[row][i] = 0; }
        for (int j = 0; j < matrix.length; j++) { matrix[j][col] = 0; }
    }
}
