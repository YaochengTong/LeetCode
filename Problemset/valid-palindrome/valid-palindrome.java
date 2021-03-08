
// @Title: 验证回文串 (Valid Palindrome)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-03 15:41:41
// @Runtime: 4 ms
// @Memory: 38.6 MB

class Solution {

    public boolean isPalindrome(String s) {
        s = changeStringToLowerCaseWithoutSpaceDigits(s);
        int i = 0, curr = s.length() - 1;
        while (i <= curr) {
            if (s.charAt(i) != s.charAt(curr)) { return false; }
            i++;
            curr--;
        }
        return true;
    }

    private String changeStringToLowerCaseWithoutSpaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

}
