
// @Title: 斐波那契数 (Fibonacci Number)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-07 11:07:46
// @Runtime: 8 ms
// @Memory: 35 MB

class Solution {

    public int fib(int n) {
        if (n < 2) { return n; }
        return fib(n - 1) + fib(n - 2);
    }

}
