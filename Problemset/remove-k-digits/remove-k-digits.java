
// @Title: 移掉K位数字 (Remove K Digits)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-02-05 00:23:31
// @Runtime: 13 ms
// @Memory: 39.2 MB

class Solution {

    public String removeKdigits(String num, int k) {
        if (num.length() == k) { return "0"; }
        Deque<Character> stack = new ArrayDeque<>();
        char[] charArray = num.toCharArray();

        for (Character c : charArray) {
            while (!stack.isEmpty() && c < stack.peek() && k > 0) {
                stack.pop();
                k--;
            }
            if (stack.isEmpty() && c == '0') { continue; }
            stack.push(c);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }
        if (stack.isEmpty()) { return "0"; }

        StringBuilder str = new StringBuilder();
        for (Character s : stack) { str.append(s);}
        return str.reverse().toString();
    }
}
