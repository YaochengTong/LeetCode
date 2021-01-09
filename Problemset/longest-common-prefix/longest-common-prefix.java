
// @Title: 最长公共前缀 (Longest Common Prefix)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-01-08 03:34:11
// @Runtime: 1 ms
// @Memory: 36.4 MB

class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) { return ""; }
        int low = 1, high = Integer.MAX_VALUE;
        for (String str : strs) { high = Math.min(high, str.length()); }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isCommonPrefix(strs, mid)) { low = mid + 1; } else { high = mid - 1; }
        }
        return strs[0].substring(0, high);
    }

    private boolean isCommonPrefix(String[] s, int length) {
        String sub = s[0].substring(0, length);
        for (int i = 1; i < s.length; i++) { if (!s[i].startsWith(sub)) { return false; } }
        return true;
    }

}
