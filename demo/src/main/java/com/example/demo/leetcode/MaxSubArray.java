package com.example.demo.leetcode;

import org.junit.Test;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        //使用动态规划，建立新的数组，存储区间内最大的值
        int[] dp = new int[nums.length];
        int maxNum = 0;
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = nums[i]>nums[i]+dp[i-1]?nums[i]:nums[i]+dp[i-1];
            maxNum = maxNum>dp[i]?maxNum:dp[i];
        }
        return maxNum;
    }

    @Test
    public void test(){
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
}
