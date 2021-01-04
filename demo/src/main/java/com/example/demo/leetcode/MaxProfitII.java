package com.example.demo.LeetCode;

import org.junit.Test;

public class MaxProfitII {
    /**
     * 定义两种情况，dp[i][0]每日没有股票，dp[i][1]每日有股票
     * @param prices
     * @param fee
     * @return
     */
    public int maxProfit(int[] prices, int fee) {
        int length = prices.length;
        int[][] dp = new int[length][2];
        dp[0][1] = -prices[0];
        dp[0][0] = 0;
        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }


        return dp[length-1][0];
    }

    @Test
    public void test(){
        int[] a = {1, 3, 7, 5, 10, 3};
        System.out.println(maxProfit(a, 2));
    }
}
