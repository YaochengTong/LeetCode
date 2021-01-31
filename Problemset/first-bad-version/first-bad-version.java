
// @Title: 第一个错误的版本 (First Bad Version)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-27 19:48:48
// @Runtime: 17 ms
// @Memory: 35.2 MB

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low > n || !isBadVersion(low)) { return -1; }
        return low;
    }
}
