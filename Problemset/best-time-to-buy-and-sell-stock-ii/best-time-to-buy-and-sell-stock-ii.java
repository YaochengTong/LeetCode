
// @Title: 买卖股票的最佳时机 II (Best Time to Buy and Sell Stock II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-27 00:51:37
// @Runtime: 1 ms
// @Memory: 38.3 MB

class Solution {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += Math.max(0, prices[i] - prices[i - 1]);
        }
        return profit;
    }
    
}
