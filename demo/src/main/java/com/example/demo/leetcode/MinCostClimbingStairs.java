package com.example.demo.LeetCode;

import org.junit.Test;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        int[] dp = new int[length + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= length; i++) {
            dp[i] = Math.min(cost[i-1]+dp[i-1], cost[i-2]+dp[i-2]);
        }
        return dp[length];
    }


    @Test
    public void test(){
        int[] a = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(a));
    }
}
