package com.example.demo.LeetCode;

import org.junit.Test;

public class NumWays {
    public int numWays(int n) {
        //递推公式f(n) = f(n-1)+f(n-2)
        int[] dp = new int[n+1];
        if(n<2) return 1;
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n ; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%1000000007;
        }
        return dp[n];
    }

    @Test
    public void test(){
        System.out.println(numWays(44));
    }
}
