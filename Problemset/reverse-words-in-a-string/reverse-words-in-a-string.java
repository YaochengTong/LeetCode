
// @Title: 翻转字符串里的单词 (Reverse Words in a String)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-28 01:48:57
// @Runtime: 11 ms
// @Memory: 38.5 MB

class Solution {

    public String reverseWords(String s) {
        s = s.trim();
        String[] stringArray = s.split("\\s+");
        List<String> list = Arrays.asList(stringArray);
        Collections.reverse(list);
        return String.join(" ", list);
    }

}
