
// @Title: 丑数 (Ugly Number)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-15 23:38:23
// @Runtime: 1 ms
// @Memory: 35.5 MB

class Solution {

    public boolean isUgly(int n) {
        if (n <= 0) { return false; }
        while (n % 2 == 0) {n /= 2;}
        while (n % 3 == 0) {n /= 3;}
        while (n % 5 == 0) { n /= 5; }
        return n == 1;
    }

}
