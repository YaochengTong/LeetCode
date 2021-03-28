
// @Title: x 的平方根 (Sqrt(x))
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-27 23:42:02
// @Runtime: 1 ms
// @Memory: 35.6 MB

class Solution {

    public int mySqrt(int x) {
        int low = 0, high = x;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) mid * mid > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

}
