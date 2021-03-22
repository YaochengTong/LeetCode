
// @Title: 丑数 II (Ugly Number II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-22 13:01:41
// @Runtime: 3 ms
// @Memory: 37.3 MB

class Solution {
    public int nthUglyNumber(int n) {
        if (n == 1) { return 1; }
        int[] res = new int[n];
        res[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;

        for (int i = 1; i < n; i++) {
            int m = min(res[index2] * 2, res[index3] * 3, res[index5] * 5);
            res[i] = m;
            if (m == res[index2] * 2) { index2++; }
            if (m == res[index3] * 3) { index3++; }
            if (m == res[index5] * 5) { index5++; }
        }

        return res[n - 1];
    }

    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}
