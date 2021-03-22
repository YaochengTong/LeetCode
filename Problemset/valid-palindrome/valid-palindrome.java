
// @Title: 验证回文串 (Valid Palindrome)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-22 14:28:19
// @Runtime: 4 ms
// @Memory: 38.5 MB

class Solution {
    public boolean isPalindrome(String s) {
        s = changeStringToLowerCaseWithoutSpaceDigits(s);
        int p1 = 0, p2 = s.length() - 1;
        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) { return false; }
            p1++;
            p2--;
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
