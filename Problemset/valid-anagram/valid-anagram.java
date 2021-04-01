
// @Title: 有效的字母异位词 (Valid Anagram)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-31 15:25:47
// @Runtime: 3 ms
// @Memory: 38.5 MB

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        return Arrays.equals(sCharArray, tCharArray);
    }
}
