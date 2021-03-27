
// @Title: 买卖股票的最佳时机 (Best Time to Buy and Sell Stock)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-03-26 17:43:26
// @Runtime: 2 ms
// @Memory: 51.3 MB

class Solution {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            int currProfit = prices[i] - minPrice;
            if (currProfit < 0) {
                minPrice = prices[i];
            } else if (currProfit > profit) {
                profit = currProfit;
            }
        }
        return profit;
    }
    
}
