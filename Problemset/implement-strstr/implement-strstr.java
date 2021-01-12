
// @Title: 实现 strStr() (Implement strStr())
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-10 03:26:31
// @Runtime: 1 ms
// @Memory: 38.3 MB

class Solution {
    
    public int strStr(String s, String t) {
        if (t.length() == 0) { return 0; }
        for (int i = 0; i < s.length() - t.length() + 1; i++) {
            if (s.charAt(i) == t.charAt(0)) {
                if (s.substring(i, i + t.length()).equals(t)) { return i; }
            }
        }
        return -1;
    }
}
