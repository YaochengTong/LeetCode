
// @Title: 螺旋矩阵 (Spiral Matrix)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-03 01:49:16
// @Runtime: 0 ms
// @Memory: 36.7 MB

class Solution {

    List<Integer> l = new ArrayList<>();

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) { return l; }
        int rowStep = matrix[0].length - 1, colStep = matrix.length - 1, start = 0;
        while (rowStep > -1 && colStep > -1) {
            circularTraversal(matrix, start++, rowStep, colStep);
            rowStep -= 2;
            colStep -= 2;
        }
        return l;
    }

    private void circularTraversal(int[][] m, int start, int rStep, int cStep) {
        if (rStep == 0) {
            for (int i = start; i < start + cStep + 1; i++) { l.add(m[i][start]); }
        } else if (cStep == 0) {
            for (int i = start; i < start + rStep + 1; i++) { l.add(m[start][i]); }
        } else {
            for (int i = start; i < start + rStep; i++) { l.add(m[start][i]); }
            for (int j = start; j < start + cStep; j++) { l.add(m[j][start + rStep]); }
            for (int k = start + rStep; k > start; k--) { l.add(m[start + cStep][k]); }
            for (int h = start + cStep; h > start; h--) { l.add(m[h][start]); }
        }
    }

}


