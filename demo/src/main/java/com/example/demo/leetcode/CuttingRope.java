package com.example.demo.leetcode;

import org.junit.Test;

public class CuttingRope {
    public int cuttingRope(int n) {
        //状态转移方程 dp[i]=max(dp[i],max(j*(i-j), dp[i-j]*j))
        //循环遍历，i为绳子长度，j为剪切的位置
        //dp[i],记录每次j遍历时候的最大值

        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i],Math.max((i-j)*j, dp[i-j]*j));
            }
        }

        return dp[n];
    }

    @Test
    public void test(){
        System.out.println(cuttingRope(58));
    }
}
