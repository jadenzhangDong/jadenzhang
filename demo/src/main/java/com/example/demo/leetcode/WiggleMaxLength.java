package com.example.demo.leetcode;

import org.junit.Test;

public class WiggleMaxLength {
    public int wiggleMaxLength(int[] nums) {
        //使用动态规划进行判断
        if(nums.length<1){
            return 0;
        }
        int[] dp = new int[nums.length];
        int index = 0;
        dp[0] = 1;
        int lastFlag = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[index] && lastFlag!=1){
                dp[i] = dp[i-1]+1;
                lastFlag = 1;
            }else if(nums[i]<nums[index] && lastFlag!=-1){
                dp[i] = dp[i-1]+1;
                lastFlag = -1;
            }else{
                dp[i] = dp[i-1];
            }
            index = i;
        }
        return dp[index];
    }

    @Test
    public void test(){
        int[] a = {33,53,12,64,50,41,45,21,97,35,47,92,39,0,
                93,55,40,46,69,42,6,95,51,68,72,9,32,84,34,64,
                6,2,26,98,3,43,30,60,3,68,82,9,97,19,27,98,99,4,
                30,96,37,9,78,43,64,4,65,30,84,90,87,64,18,50,60,1,40
                ,32,48,50,76,100,57,29,63,53,46,57,93,98,42,80,82,9,41,55
                ,69,84,82,79,30,79,18,97,67,23,52,38,74,15};
        System.out.println(wiggleMaxLength(a));
    }
}
