
// @Title: 分发饼干 (Assign Cookies)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-23 20:20:34
// @Runtime: 8 ms
// @Memory: 39.3 MB

class Solution {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;

        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) { i++; }
            j++;
        }
        return i;
    }

}
