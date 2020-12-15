package com.example.demo.leetcode;

import org.junit.Test;

public class MaxValue {
    public int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int maxValue = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if(i==0&&j==0){
                    dp[0][0] = grid[i][j];
                }else if(i==0 && j>0){
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                }else if(j==0 && i>0){
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) + grid[i][j];
                }
                maxValue = Math.max(dp[i][j], maxValue);

            }
        }
        return maxValue;
    }
    @Test
    public void test(){
        int[][] a = {{1,2,5}, {3,2,1}};
        System.out.println(maxValue(a));
    }
}
