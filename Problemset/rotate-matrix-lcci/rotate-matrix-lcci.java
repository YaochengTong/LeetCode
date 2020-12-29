
// @Title: 旋转矩阵 (Rotate Matrix LCCI)
// @Author: tongyaocheng@gmail.com
// @Date: 2020-12-28 17:00:10
// @Runtime: 0 ms
// @Memory: 38.2 MB

class Solution {

    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < (matrix.length + 1) / 2; j++) {
                int temp = matrix[i][j];
                // System.out.println(temp);
                matrix[i][j] = matrix[n - j][i];
                matrix[n - j][i] = matrix[n - i][n - j];
                matrix[n - i][n - j] = matrix[j][n - i];
                matrix[j][n - i] = temp;
            }
        }
    }

    
}
