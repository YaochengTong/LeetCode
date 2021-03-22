
// @Title: 基本计算器 II (Basic Calculator II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-22 10:37:30
// @Runtime: 15 ms
// @Memory: 38.4 MB

class Solution {

    public int calculate(String s) {
        Deque<Integer> numbers = new ArrayDeque<>();
        int number = 0;
        char preOp = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) { number = number * 10 + c - '0'; }
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                switch (preOp) {
                    case '+':
                        numbers.push(number);
                        break;
                    case '-':
                        numbers.push(-number);
                        break;
                    case '*':
                        numbers.push(numbers.pop() * number);
                        break;
                    case '/':
                        numbers.push(numbers.pop() / number);
                        break;
                }
                preOp = c;
                number = 0;
            }
        }
        int result = 0;
        while (!numbers.isEmpty()) { result += numbers.pop(); }
        return result;
    }

}
