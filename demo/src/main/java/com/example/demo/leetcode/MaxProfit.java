package com.example.demo.leetcode;

import org.junit.Test;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        //定义双指针，双向遍历，遍历到相遇的时候则停止，寻找到最大和最小值进行相减
        int maxProfit = 0;
        if(prices.length>0){
            int minPrice = prices[0];
            for (int i = 1; i < prices.length; i++) {
                if(minPrice>prices[i]){
                    minPrice = prices[i];
                    continue;
                }
                maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            }

        }
        return maxProfit;
    }

    @Test
    public void test(){
        int[] a = {1};
        System.out.println(maxProfit(a));
    }
}
