
// @Title: 无重复字符的最长子串 (Longest Substring Without Repeating Characters)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-31 23:59:46
// @Runtime: 7 ms
// @Memory: 38.6 MB

class Solution {

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            maxLength = Math.max(i - start + 1, maxLength);
            map.put(c, i);
        }
        return maxLength;
    }

}
